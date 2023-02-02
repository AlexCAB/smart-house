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

package cab.smarthouse.backend

import de.re.easymodbus.modbusclient.ModbusClient


object Main extends App {

  def toFloat(rs: List[Int]): Float = rs match
    case l :: h :: Nil => java.lang.Float.intBitsToFloat((h << 16) | l)
    case _ => throw new NumberFormatException(s"Expected list with two items, got: $rs")



  val modbusClient = new ModbusClient("10.0.6.10", 502)
  try {
    modbusClient.Connect()
//
//
//    modbusClient.WriteSingleCoil(0, true)
//    modbusClient.WriteSingleRegister(0, 1234)
//    modbusClient.WriteMultipleRegisters(11, ModbusClient.ConvertFloatToTwoRegisters(123.56.toFloat))
//    System.out.println(modbusClient.ReadCoils(0, 1)(0))
//    System.out.println(modbusClient.ReadHoldingRegisters(0, 1)(0))
//    println(modbusClient.ReadInputRegisters(11, 2).toList)


//    (0 to 200).foreach(i =>  println(s"${i} => " + modbusClient.ReadInputRegisters(i, 1).toList))





      println(s"672 => " + modbusClient.ReadCoils(672, 1).toList)
      println(s"673 => " + modbusClient.ReadCoils(673, 1).toList)
      println(s"674 => " + modbusClient.ReadCoils(674, 1).toList)
      println(s"675 => " + modbusClient.ReadCoils(675, 1).toList)


      println(s"272 => " + modbusClient.ReadCoils(272, 1).toList)



//
    println(s"12 => " + toFloat(modbusClient.ReadInputRegisters(12, 2).toList))
//
//    println(s"12 => " + toFloat(modbusClient.ReadInputRegisters(12, 2).toList))








  } catch {
    case e: Exception =>
      println("DDDDDDDDDDDDDDDDDDDDDDD " + e)

  }





}