package com.kodekutters.core

import java.util.UUID

import scala.collection.immutable.HashMap

/**
  * Declarations are defined GATT profile attribute types.​
  *
  * ref: https://developer.bluetooth.org/gatt/declarations/Pages/DeclarationsHome.aspx
 */
object Declarations {

  import GattUtils._

  val GATT_CHARACTERISTIC_DECLARATION = new UUID((0x2803L << 32) | 0x1000, leastSigBits)
  val GATT_INCLUDE_DECLARATION = new UUID((0x2802L << 32) | 0x1000, leastSigBits)
  val GATT_PRIMARY_SERVICE_DECLARATION = new UUID((0x2800L << 32) | 0x1000, leastSigBits)
  val GATT_SECONDARY_SERVICE_DECLARATION = new UUID((0x2801L << 32) | 0x1000, leastSigBits)

  val attributes = HashMap[UUID, String](
    GATT_CHARACTERISTIC_DECLARATION -> "GATT Characteristic Declaration",
    GATT_INCLUDE_DECLARATION -> "GATT Include Declaration",
    GATT_PRIMARY_SERVICE_DECLARATION -> "GATT Primary Service Declaration",
    GATT_SECONDARY_SERVICE_DECLARATION -> "GATT Secondary Service Declaration")

  def lookup(uuid: UUID, defaultName: String) = {
    attributes.get(uuid) match {
      case Some(name) => name
      case None => defaultName
    }
  }

  def find(uuid: UUID): Option[String] = attributes.get(uuid)

}