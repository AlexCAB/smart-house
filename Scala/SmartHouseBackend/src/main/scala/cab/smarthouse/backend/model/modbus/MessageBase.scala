/**********************************************
  o-o                 o      o  o
 |                    |      |  |
  o-o  o-O-o  oo o-o -o-     O--O o-o o  o o-o
     | | | | | | |    |      |  | | | |  |  \
 o--o  o o o o-o-o    o      o  o o-o o--o o-o

author: CAB
website: github.com/alexcab
created: 2023-02-02
 **********************************************/

package cab.smarthouse.backend.model.modbus

import de.re.easymodbus.modbusclient.ModbusClient

import scala.reflect.ClassTag
import scala.util.{Failure, Success, Try}


trait ModbusValue[V, R] {
  val value: Option[V]
  val error: Option[Throwable] = None
  val isChanged: Boolean = false

  def write(implicit con: ModbusClient, mr: ClassTag[R]): R
  def read(implicit con: ModbusClient, mr: ClassTag[R]): R
  def parse(registers: Array[Int])(mr: ClassTag[R]): R

  private val constructor = getClass.getDeclaredConstructor(classOf[Option[V]])

  private val errField = getClass.getDeclaredField("error")
  errField.setAccessible(true)

  private val isChField = getClass.getDeclaredField("isChanged")
  isChField.setAccessible(true)

  private def copyThis(value: Option[V], error: Option[Throwable], isChanged: Boolean)(implicit mr: ClassTag[R]): R = {
    val res = constructor.newInstance(value).asInstanceOf[R]
    errField.set(res, error)
    isChField.set(res, isChanged)
    res
  }

  protected val (adr, tp): (Int, Char) = this.getClass.getName.split('.').lastOption.map(_.split('_').toList) match {
    case Some(_ :: tp :: adr :: _) if tp.length == 1 => (adr.toInt, tp.head)
    case r => throw new RuntimeException(
      s"[ModbusValue.adr] Invalid class name, expected something like 'U1_C_0000_work_ok', got: $r")
  }

  protected def writer(wf: V=>Unit)(implicit mr: ClassTag[R]): R = value
    .map(v => Try(wf(v)).fold(
      err => copyThis(
        value,
        Some(new RuntimeException(s"[ModbusValue.writer] Error on writing value = $value, at adr = $adr", err)),
        false),
      _ => copyThis(value, None, false)))
    .getOrElse(copyThis(
      value,
      Some(new RuntimeException(s"[ModbusValue.writer] Can't write empty value, at adr = $adr")),
      false))

  protected def reader[I](rf: =>Array[I])(convert: Array[I]=>Try[V])(implicit mr: ClassTag[R]): R = Try(rf)
    .recoverWith(err => Failure(
      new RuntimeException(s"[ModbusValue.reader] Failed to read value at adr = $adr", err)))
    .flatMap(in => convert(in)
      .recoverWith(err => Failure(
        new RuntimeException(
          s"[ModbusValue.reader] Failed to convert raw value ${in.toList}, read at adr = $adr", err))))
    .fold(
      err => copyThis(
        None,
        Some(new RuntimeException(s"[ModbusValue.reader] Error on reader at adr = $adr", err)),
        value.nonEmpty),
      res => copyThis(
        Some(res),
        None,
        ! value.contains(res)))

  protected def parser(registers: Array[Int], reg: Int)(pr: Int=>Try[V])(implicit mr: ClassTag[R]): R =
    val tryV =  if (registers.length > reg)  pr(reg) else Failure(new RuntimeException(
      s"[ModbusCoil.parse] Address ia out of bounds, registers.length = ${registers.length}, <= reg = $reg"))

    tryV.fold(
      err => copyThis(
        None,
        Some(new RuntimeException(s"[ModbusValue.parse] Error on parsing at adr = $adr", err)),
        value.nonEmpty),
      res => copyThis(
        Some(res),
        None,
        !value.contains(res)))

  override def toString: String =
    getClass.getSimpleName + s"(value = $value, error = $error, isChanged = $isChanged)"
}


trait ModbusCoil[T <: ModbusValue[Boolean, T]] extends ModbusValue[Boolean, T] {
  assert(tp == 'C', s"[ModbusCoil.<init>] Invalid class name, expected coil, got $tp")

  def write(implicit con: ModbusClient, mt: ClassTag[T]): T = writer(v => con.WriteSingleCoil(adr, v))

  def read(implicit con: ModbusClient, mr: ClassTag[T]): T = reader(con.ReadCoils(adr, 1))(in => Try(in.head))

  def parse(registers: Array[Int])(implicit mr: ClassTag[T]): T = parser(registers, adr / 16)(reg =>
    Success(((registers(reg) >> (adr % 16)) & 0x00000001) != 0))
}


trait ModbusRegister[T <: ModbusValue[Int, T]] extends ModbusValue[Int, T] {
  assert(tp == 'R', s"[ModbusCoil.<init>] Invalid class name, expected register, got $tp")

  def write(implicit con: ModbusClient, mt: ClassTag[T]): T =
    writer(v => con.WriteSingleRegister(adr, v))

  def read(implicit con: ModbusClient, mr: ClassTag[T]): T =
    reader(con.ReadInputRegisters(adr, 1))(in => Try(in.head & 0x0000FFFF))

  def parse(registers: Array[Int])(implicit mr: ClassTag[T]): T = parser(registers, adr)(reg =>
    Success(registers(reg) & 0x0000FFFF))
}


trait ModbusFloat[T <: ModbusValue[Float, T]] extends ModbusValue[Float, T] {
  assert(tp == 'F', s"[ModbusCoil.<init>] Invalid class name, expected float, got $tp")

  private def parseFloat(l: Int, h: Int): Try[Float] =
    Try(java.lang.Float.intBitsToFloat((h << 16) | (l & 0x0000FFFF))).flatMap {
      case f if !f.isNaN && f.isFinite =>  Success(f)
      case f => Failure(new RuntimeException(s"[ModbusFloat.read] Failed to parse float value, got: $f"))
    }

  def write(implicit con: ModbusClient, mt: ClassTag[T]): T = writer { v =>
      val f = java.lang.Float.floatToIntBits(v)
      con.WriteMultipleRegisters(adr, Array(f & 0x0000FFFF, f >> 16))
  }

  def read(implicit con: ModbusClient, mr: ClassTag[T]): T = reader(con.ReadInputRegisters(adr, 2))(_.toList match
    case l :: h :: Nil => parseFloat(l, h)
    case r => Failure(new RuntimeException(
      s"[ModbusValue.read] Failed to read register at adr: $adr, got: $r")))

  def parse(registers: Array[Int])(implicit mr: ClassTag[T]): T = parser(registers, adr) { reg =>
    if (registers.length > (reg + 1)) parseFloat(registers(reg), registers(reg + 1))
    else Failure(new RuntimeException(
      s"[ModbusFloat.parse] Address ia out of bounds, registers.length = ${registers.length}, <= reg + 1 = ${reg + 1}"))
  }
}
