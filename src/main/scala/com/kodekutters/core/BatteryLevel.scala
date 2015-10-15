package com.kodekutters.core

import akka.util.ByteString

case class BatteryLevel(value: ByteString) {

  implicit val byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN

  /**
   * @return The current charge level of a battery in %. 100% represents fully
   *         charged while 0% represents fully discharged.
   */
  def batteryLevel(): Byte = GattUtils.asByteBuffer(value).get()

}
