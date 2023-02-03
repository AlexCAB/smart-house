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

import cab.smarthouse.backend.model.modbus.{ModbusValue, U1_C_0008_config_loaded, U1_F_044_room_warm_floor_set_temperature, U1_R_007_bathroom_light_intensity}
import de.re.easymodbus.modbusclient.ModbusClient

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._


//TODO Implementation notes:
//TODO   *. If UI not used BE should read all PLC registers once in 200-500 mills.
//TODO   *. If UI is used, reading timeout may be 50-100 mills, also some registers may be
//TODO      read even faster to make UI responsive.
//TODO   *. PLC component should have 2 input streams an 1 output:
//TODO       -. Register update input stream (messages received here will update PLC over TCP Modbus)
//TODO       -. Control input stream (to control component behavior, for example reading timeouts).
//TODO       -. Register read output stream (produce messages on each update of PLC state).
//TODO   *. On each read iteration PLC component should all registers (it take about 40 mills,
//TODO      same as reading of 1 register). Parse it (using <msg>.parse()). Then compare them to previously read
//TODO      (using <msg>.isChanged flag). Then send changed to output.
//TODO   *. Previously read state is just set of the parsed messaged (To think how to implement using streams)
//TODO
//TODO
//TODO
//TODO
//TODO
//TODO
//TODO
//TODO
//TODO
//TODO






object Main extends App {

  def toFloat(rs: List[Int]): Float = rs match
    case l :: h :: Nil => java.lang.Float.intBitsToFloat((h << 16) | l)
    case _ => throw new NumberFormatException(s"Expected list with two items, got: $rs")


//
  implicit val modbusClient1: ModbusClient = new ModbusClient("10.0.6.10", 502)
  implicit val modbusClient2: ModbusClient = new ModbusClient("10.0.6.10", 502)
  implicit val modbusClient3: ModbusClient = new ModbusClient("10.0.6.10", 502)
  implicit val modbusClient4: ModbusClient = new ModbusClient("10.0.6.10", 502)
  implicit val modbusClient5: ModbusClient = new ModbusClient("10.0.6.10", 502)

  try {
//    Thread.sleep(100)
//    modbusClient1.Connect()
//    Thread.sleep(100)
//    modbusClient2.Connect()
//    Thread.sleep(100)
//    modbusClient3.Connect()
//    Thread.sleep(100)
//    modbusClient4.Connect()
//    Thread.sleep(100)
//    modbusClient5.Connect()
//    Thread.sleep(100)
//
//
//    modbusClient.WriteSingleCoil(0, true)
//    modbusClient.WriteSingleRegister(0, 1234)
//    modbusClient.WriteMultipleRegisters(11, ModbusClient.ConvertFloatToTwoRegisters(123.56.toFloat))
//    System.out.println(modbusClient.ReadCoils(0, 1)(0))
//    System.out.println(modbusClient.ReadHoldingRegisters(0, 1)(0))
//    println(modbusClient.ReadInputRegisters(11, 2).toList)

    val cs = List(modbusClient1, modbusClient2, modbusClient3, modbusClient4, modbusClient4)

    val css = List(cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs, cs).flatten

    println("css.size = " + css.size)

    val start = System.currentTimeMillis()



   val f = Future.sequence(css.map { c =>

     Future(println("TTTTTTTTTTTTTTT" + c.ReadInputRegisters(0, 1).toList))



   }

   )

    Await.result(f, 60.seconds)


//
//
//    val rs =  modbusClient.ReadInputRegisters(0, 125)
//
//
//
//    val c = U1_F_044_room_warm_floor_set_temperature().parse(rs)
//
//
//    println("CCCCCCC  " + c)
//
//
    println("Time: " + (System.currentTimeMillis() - start))




//    U1_C_0008_config_loaded(true).write




//
//    val t = U1_C_0008_config_loaded.read
//
//    U1_R_007_bathroom_light_intensity(1234).write
//
//    val t = U1_R_007_bathroom_light_intensity.read
////////
////////
//    println("DDDDDDDDDDDDDDDDDDDDDDD " + t)

//
//    U1_F_044_room_warm_floor_set_temperature(12.34).write
//
//    val t = ModbusValue.read[Boolean, U1_C_0008_config_loaded]
////    //////
////    //////
//    println("DDDDDDDDDDDDDDDDDDDDDDD " + t)

//    val w = U1_F_044_room_warm_floor_set_temperature(Some(43.21f)).write
//
//
//
//    println("JJJJJJJJJJJJJJJJJ " + w)


//
//    val r = U1_F_044_room_warm_floor_set_temperature(Some(43.21f)).read
//
//
//    println("RRRRRRRRRRRRRRRRR " + r)

//      println(s"672 => " + modbusClient.ReadCoils(672, 1).toList)
//      println(s"673 => " + modbusClient.ReadCoils(673, 1).toList)
//      println(s"674 => " + modbusClient.ReadCoils(674, 1).toList)
//      println(s"675 => " + modbusClient.ReadCoils(675, 1).toList)
//
//
//      println(s"272 => " + modbusClient.ReadCoils(272, 1).toList)
//
//
//
////
//    println(s"12 => " + toFloat(modbusClient.ReadInputRegisters(12, 2).toList))
//
//    println(s"12 => " + toFloat(modbusClient.ReadInputRegisters(12, 2).toList))








  } catch {
    case e: Exception =>
      println("DDDDDDDDDDDDDDDDDDDDDDD " + e)

  }





}