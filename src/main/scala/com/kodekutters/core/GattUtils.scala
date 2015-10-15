package com.kodekutters.core

import java.nio.ByteOrder

import akka.util.ByteString

import io.jvm.uuid._

/**
  * support utilities
 */
object GattUtils {

  val leastSigBits = 0x800000805f9b34fbL

  val FIRST_BITMASK = 0x01
  val SECOND_BITMASK = FIRST_BITMASK << 1
  val THIRD_BITMASK = FIRST_BITMASK << 2
  val FOURTH_BITMASK = FIRST_BITMASK << 3
  val FIFTH_BITMASK = FIRST_BITMASK << 4
  val SIXTH_BITMASK = FIRST_BITMASK << 5
  val SEVENTH_BITMASK = FIRST_BITMASK << 6
  val EIGTH_BITMASK = FIRST_BITMASK << 7

  val FORMAT_UINT8 = 17
  val FORMAT_UINT16 = 18
  val FORMAT_UINT32 = 20
  val FORMAT_SINT8 = 33
  val FORMAT_SINT16 = 34
  val FORMAT_SINT32 = 36
  val FORMAT_SFLOAT = 50
  val FORMAT_FLOAT = 52

  def toUuid(uuidString: String) = UUID.fromString(uuidString)

  def toUuid(assignedNumber: Long) = UUID((assignedNumber << 32) | 0x1000, leastSigBits)

  def toUuid128(assignedNumber: Long) = toUuid(assignedNumber).toString

  def toUuid16(assignedNumber: Int) = assignedNumber.toHexString

  def getIntValue(value: ByteString, format: Int, position: Int) = {
    if (!(position + (format & 0xF) > value.length)) {
      format match {
        case FORMAT_UINT8 => value(position) & 0xFF
        case FORMAT_UINT16 => value(position) + value(position + 1)
        case FORMAT_UINT32 => value(position) + value(position + 1) + value(position + 2) + value(position + 3)
        case FORMAT_SINT8 => signed(value(position) & 0xFF, 8)
        case FORMAT_SINT16 => signed(value(position) + value(position + 1), 16)
        case FORMAT_SINT32 => signed(value(position) + value(position + 1) + value(position + 2) + value(position + 3), 32)
        case _ => null
      }
    }
  }

  def signed(value: Int, length: Int): Int = {
    if ((value & 1 << length - 1) != 0)
      -1 * ((1 << length - 1) - (value & (1 << length - 1) - 1))
    else
      value
  }

  def asUint16(value: Short) = if (value < 0) (value + (1 << 16)).toShort else value.toShort

  def asUint8(value: Short) = if (value < 0) (value + (1.toShort << 16)).toShort else value.toShort

  def asByteBuffer(value: ByteString) = value.toByteBuffer.order(ByteOrder.LITTLE_ENDIAN)

  /**
   * Convert string to a byte array.
   */
  def hexStringToByteArray(hexString: String) = {
    val len = hexString.length()
    val data = new Array[Byte](len / 2)
    for (i <- 0 until len by 2) {
      data(i / 2) = ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i + 1), 16)).toByte
    }
    data
  }

}

