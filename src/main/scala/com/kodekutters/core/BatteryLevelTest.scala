package com.kodekutters.core

import akka.util.ByteString


object BatteryLevelTest {

  def main(args: Array[String]) {
    val batteryLevel = new BatteryLevel(ByteString(0x2C))
    println("Battery level should be 44 --> " + batteryLevel.batteryLevel())
  }
}