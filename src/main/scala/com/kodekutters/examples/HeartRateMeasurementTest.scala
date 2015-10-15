package com.kodekutters.examples

import akka.util.ByteString
import com.kodekutters.core.{GattUtils, HeartRateMeasurement, SensorWorn}


object HeartRateMeasurementTest {

  def main(args: Array[String]) {

    val testValue = ByteString(GattUtils.hexStringToByteArray("16485401EC02"))
    val hrm = new HeartRateMeasurement(testValue)

    println("HR should be 72 ---> " + (hrm.hrm == 72))
    println("Sensor is worn ---> " + (hrm.sensorWorn == SensorWorn.WORN))
    println("EE should not be available ---> " + hrm.ee.isEmpty)
    println("2 RR intervals should be available ---> " + (hrm.rrIntervals.size == 2))
    println("RR intervals should be correct ---> " + (hrm.rrIntervals(0) == 0.33203125 && hrm.rrIntervals(1) == 0.73046875))
    hrm.rrIntervals.foreach(v => println("     interval: " + v))
  }

}