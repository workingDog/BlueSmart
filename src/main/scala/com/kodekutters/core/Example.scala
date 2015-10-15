package com.kodekutters.core

import java.util.UUID

import akka.util.ByteString

object Example {

  def main(args: Array[String]) {
    import Characteristic._

    // onConnected
    // TODO: iterate over available services
    val serviceUuid: UUID = null   // service.uuid
    if (Service.HEART_RATE == serviceUuid) {
      // TODO: iterate over characteristics
      val characteristicUuid: UUID = null    // characteristic.uuid
      if (HEART_RATE_MEASUREMENT == characteristicUuid) {
        // TODO: Enable notification
        // val descriptor = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIGURATION)
        // descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)
        // mBluetoothGatt.writeDescriptor(descriptor)
      }
    }
    else {
      println("Found unused Service: " + Service.lookup(serviceUuid, "unknown"))
    }

    // onCharacteristicChanged
    val characteristicUuid: UUID = null   // characteristic.uuid
    if (HEART_RATE_MEASUREMENT == characteristicUuid) {
      val value = ByteString()  // characteristic.value
      val hrm = new HeartRateMeasurement(value)
      println("HR: " + hrm.hrm + "bpm")
      println("EE: " + hrm.ee + "kJ")
    }
  }

}
