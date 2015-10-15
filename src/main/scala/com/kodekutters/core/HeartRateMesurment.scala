package com.kodekutters.core

import akka.util.ByteString

import scala.collection.mutable.ArrayBuffer


sealed trait SensorWorn

object SensorWorn {
  case object UNSUPPORTED extends SensorWorn
  case object WORN extends SensorWorn
  case object NOT_WORN extends SensorWorn
}


case class HeartRateMeasurement(value: ByteString) {

  import SensorWorn._
  import GattUtils._

  private val byteBuff = asByteBuffer(value)

  private val flags = asUint8(byteBuff.get())

  /**
   * the RR-Intervals. Units: seconds
   */
  val hrm = if (isHeartRateInUINT16()) asUint16(byteBuff.getShort) else asUint8(byteBuff.get())

  /**
   * the Energy Expended, Units: kilo Joules
   */
  val ee = if (isEePresent()) Some(asUint16(byteBuff.getShort)) else None

  val rrIntervals = new ArrayBuffer[Float]()
  if (isRrIntPresent()) {
    while (byteBuff.hasRemaining()) rrIntervals += asUint16(byteBuff.getShort).toFloat / 1024f
  }

  val sensorWorn = if (isWornStatusPresent()) {
    if (isSensorWorn()) WORN else NOT_WORN
  } else UNSUPPORTED

  private def isHeartRateInUINT16() = (flags & FIRST_BITMASK) != 0

  private def isWornStatusPresent() = (flags & THIRD_BITMASK) != 0

  private def isSensorWorn() = (flags & SECOND_BITMASK) != 0

  private def isEePresent() = (flags & FOURTH_BITMASK) != 0

  private def isRrIntPresent() = (flags & FIFTH_BITMASK) != 0

}