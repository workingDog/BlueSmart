package com.kodekutters.core

import scala.collection.immutable.HashMap
import java.util.UUID

/**
  * Services are collections of characteristics and relationships to other services that encapsulate the behavior of part of a device.
  *
  * ref: https://developer.bluetooth.org/gatt/services/Pages/ServicesHome.aspx
 */
object Service {

  import GattUtils._

  val ALERT_NOTIFICATION_SERVICE = new UUID((0x1811L << 32) | 0x1000, leastSigBits)
  val AUTOMATION_IO = new UUID((0x1815L << 32) | 0x1000, leastSigBits)
  val BATTERY_SERVICE = new UUID((0x180FL << 32) | 0x1000, leastSigBits)
  val BLOOD_PRESSURE = new UUID((0x1810L << 32) | 0x1000, leastSigBits)
  val BODY_COMPOSITION = new UUID((0x181BL << 32) | 0x1000, leastSigBits)
  val BOND_MANAGEMENT = new UUID((0x181EL << 32) | 0x1000, leastSigBits)
  val CONTINUOUS_GLUCOSE_MONITORING = new UUID((0x181FL << 32) | 0x1000, leastSigBits)
  val CURRENT_TIME_SERVICE = new UUID((0x1805L << 32) | 0x1000, leastSigBits)
  val CYCLING_POWER = new UUID((0x1818L << 32) | 0x1000, leastSigBits)
  val CYCLING_SPEED_AND_CADENCE = new UUID((0x1816L << 32) | 0x1000, leastSigBits)
  val DEVICE_INFORMATION = new UUID((0x180AL << 32) | 0x1000, leastSigBits)
  val ENVIRONMENTAL_SENSING = new UUID((0x181AL << 32) | 0x1000, leastSigBits)
  val GENERIC_ACCESS = new UUID((0x1800L << 32) | 0x1000, leastSigBits)
  val GENERIC_ATTRIBUTE = new UUID((0x1801L << 32) | 0x1000, leastSigBits)
  val GLUCOSE = new UUID((0x1808L << 32) | 0x1000, leastSigBits)
  val HEALTH_THERMOMETER = new UUID((0x1809L << 32) | 0x1000, leastSigBits)
  val HEART_RATE = new UUID((0x180DL << 32) | 0x1000, leastSigBits)
  val HUMAN_INTERFACE_DEVICE = new UUID((0x1812L << 32) | 0x1000, leastSigBits)
  val IMMEDIATE_ALERT = new UUID((0x1802L << 32) | 0x1000, leastSigBits)
  val INDOOR_POSITIONING = new UUID((0x1821L << 32) | 0x1000, leastSigBits)
  val INTERNET_PROTOCOL_SUPPORT = new UUID((0x1820L << 32) | 0x1000, leastSigBits)
  val LINK_LOSS = new UUID((0x1803L << 32) | 0x1000, leastSigBits)
  val LOCATION_AND_NAVIGATION = new UUID((0x1819L << 32) | 0x1000, leastSigBits)
  val NEXT_DST_CHANGE_SERVICE = new UUID((0x1807L << 32) | 0x1000, leastSigBits)
  val PHONE_ALERT_STATUS_SERVICE = new UUID((0x180EL << 32) | 0x1000, leastSigBits)
  val PULSE_OXIMETER = new UUID((0x1822L << 32) | 0x1000, leastSigBits)
  val REFERENCE_TIME_UPDATE_SERVICE = new UUID((0x1806L << 32) | 0x1000, leastSigBits)
  val RUNNING_SPEED_AND_CADENCE = new UUID((0x1814L << 32) | 0x1000, leastSigBits)
  val SCAN_PARAMETERS = new UUID((0x1813L << 32) | 0x1000, leastSigBits)
  val TX_POWER = new UUID((0x1804L << 32) | 0x1000, leastSigBits)
  val USER_DATA = new UUID((0x181CL << 32) | 0x1000, leastSigBits)
  val WEIGHT_SCALE = new UUID((0x181DL << 32) | 0x1000, leastSigBits)

  val attributes = HashMap[UUID, String](
    ALERT_NOTIFICATION_SERVICE -> "Alert Notification Service",
    AUTOMATION_IO -> "Automation IO",
    BATTERY_SERVICE -> "Battery Service",
    BLOOD_PRESSURE -> "Blood Pressure",
    BODY_COMPOSITION -> "Body Composition",
    BOND_MANAGEMENT -> "Bond Management",
    CONTINUOUS_GLUCOSE_MONITORING -> "Continuous Glucose Monitoring",
    CURRENT_TIME_SERVICE -> "Current Time Service",
    CYCLING_POWER -> "Cycling Power",
    CYCLING_SPEED_AND_CADENCE -> "Cycling Speed and Cadence",
    DEVICE_INFORMATION -> "Device Information",
    ENVIRONMENTAL_SENSING -> "Environmental Sensing",
    GENERIC_ACCESS -> "Generic Access",
    GENERIC_ATTRIBUTE -> "Generic Attribute",
    GLUCOSE -> "Glucose",
    HEALTH_THERMOMETER -> "Health Thermometer",
    HEART_RATE -> "Heart Rate",
    HUMAN_INTERFACE_DEVICE -> "Human Interface Device",
    IMMEDIATE_ALERT -> "Immediate Alert",
    INDOOR_POSITIONING -> "Indoor Positioning",
    INTERNET_PROTOCOL_SUPPORT -> "Internet Protocol Support",
    LINK_LOSS -> "Link Loss",
    LOCATION_AND_NAVIGATION -> "Location and Navigation",
    NEXT_DST_CHANGE_SERVICE -> "Next DST Change Service",
    PHONE_ALERT_STATUS_SERVICE -> "Phone Alert Status Service",
    PULSE_OXIMETER -> "Pulse Oximeter",
    REFERENCE_TIME_UPDATE_SERVICE -> "Reference Time Update Service",
    RUNNING_SPEED_AND_CADENCE -> "Running Speed and Cadence",
    SCAN_PARAMETERS -> "Scan Parameters",
    TX_POWER -> "Tx Power",
    USER_DATA -> "User Data",
    WEIGHT_SCALE -> "Weight Scale")

  def lookup(uuid: UUID, defaultName: String) = {
    attributes.get(uuid) match {
      case Some(name) => name
      case None => defaultName
    }
  }

  def find(uuid: UUID): Option[String] = attributes.get(uuid)

}