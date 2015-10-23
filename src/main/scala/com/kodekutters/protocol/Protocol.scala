package com.kodekutters.protocol

import java.util.UUID

/**
  * todo
  */

case class Field(name: String, unit: String, format: String, `type`: String, requirement: String, reference: String,
                 minimum: Long, maximum: Long, enumerations: List[Enumerations],
                 bitfield: BitField, referenceFields: List[Field]) {}

case class Enumerations(key: Int, value: String, requires: String) {}

case class BitField(bits: List[Bit]) {}

case class Bit(index: Int, size: Int, name: String, enumerations: List[Enumerations]) {}

case class Characteristics(name: String, summary: String, uuid: UUID, `type`: String, fields: List[Field]) {}

case class Service(name: String, summary: String, uuid: UUID, characteristics: List[Characteristics]) {}

case class ServiceCharacteristic(name: String, `type`: String, descriptors: List[Descriptor]) {}

case class Descriptor(name: String, `type`: String, uuid: UUID) {}

case class Device(name: String, `type`: String, uuid: UUID) {}

case class GattUnit(symbol: String, fullName: String) {
  override def toString() = symbol + " " + fullName
}