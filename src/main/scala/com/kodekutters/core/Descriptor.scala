package com.kodekutters.core

import scala.collection.immutable.HashMap
import java.util.UUID


/**
  * Descriptors are defined attributes that describe a characteristic value.
  *
  * ref: https://developer.bluetooth.org/gatt/descriptors/Pages/DescriptorsHomePage.aspx
 */
object Descriptor {

  import GattUtils._

  val CHARACTERISTIC_EXTENDED_PROPERTIES = new UUID((0x2900L << 32) | 0x1000, leastSigBits)
  val CHARACTERISTIC_USER_DESCRIPTION = new UUID((0x2901L << 32) | 0x1000, leastSigBits)
  val CLIENT_CHARACTERISTIC_CONFIGURATION = new UUID((0x2902L << 32) | 0x1000, leastSigBits)
  val SERVER_CHARACTERISTIC_CONFIGURATION = new UUID((0x2903L << 32) | 0x1000, leastSigBits)
  val CHARACTERISTIC_PRESENTATION_FORMAT = new UUID((0x2904L << 32) | 0x1000, leastSigBits)
  val CHARACTERISTIC_AGGREGATE_FORMAT = new UUID((0x2905L << 32) | 0x1000, leastSigBits)
  val VALID_RANGE = new UUID((0x2906L << 32) | 0x1000, leastSigBits)
  val EXTERNAL_REPORT_REFERENCE = new UUID((0x2907L << 32) | 0x1000, leastSigBits)
  val REPORT_REFERENCE = new UUID((0x2908L << 32) | 0x1000, leastSigBits)
  val NUMBER_OF_DIGITALS = new UUID((0x2909L << 32) | 0x1000, leastSigBits)
  val VALUE_TRIGGER_SETTING = new UUID((0x290AL << 32) | 0x1000, leastSigBits)
  val ENVIRONMENTAL_SENSING_CONFIGURATION = new UUID((0x290BL << 32) | 0x1000, leastSigBits)
  val ENVIRONMENTAL_SENSING_MEASUREMENT = new UUID((0x290CL << 32) | 0x1000, leastSigBits)
  val ENVIRONMENTAL_SENSING_TRIGGER_SETTING = new UUID((0x290DL << 32) | 0x1000, leastSigBits)
  val TIME_TRIGGER_SETTING = new UUID((0x290EL << 32) | 0x1000, leastSigBits)
  val TEST_COMPLEX_BITFIELD = new UUID((0L << 32) | 0x1000, leastSigBits)

  val attributes = HashMap[UUID, String](
    CHARACTERISTIC_EXTENDED_PROPERTIES -> "Characteristic Extended Properties",
    CHARACTERISTIC_USER_DESCRIPTION -> "Characteristic User Description",
    CLIENT_CHARACTERISTIC_CONFIGURATION -> "Client Characteristic Configuration",
    SERVER_CHARACTERISTIC_CONFIGURATION -> "Server Characteristic Configuration",
    CHARACTERISTIC_PRESENTATION_FORMAT -> "Characteristic Presentation Format",
    CHARACTERISTIC_AGGREGATE_FORMAT -> "Characteristic Aggregate Format",
    VALID_RANGE -> "Valid Range",
    EXTERNAL_REPORT_REFERENCE -> "External Report Reference",
    REPORT_REFERENCE -> "Report Reference",
    NUMBER_OF_DIGITALS -> "Number of Digitals",
    VALUE_TRIGGER_SETTING -> "Value Trigger Setting",
    ENVIRONMENTAL_SENSING_CONFIGURATION -> "Environmental Sensing Configuration",
    ENVIRONMENTAL_SENSING_MEASUREMENT -> "Environmental Sensing Measurement",
    ENVIRONMENTAL_SENSING_TRIGGER_SETTING -> "Environmental Sensing Trigger Setting",
    TIME_TRIGGER_SETTING ->  "Time Trigger Setting",
    TEST_COMPLEX_BITFIELD -> "Test Complex BitField")

  def lookup(uuid: UUID, defaultName: String) = {
    attributes.get(uuid) match {
      case Some(name) => name
      case None => defaultName
    }
  }

  def find(uuid: UUID): Option[String] = attributes.get(uuid)

}