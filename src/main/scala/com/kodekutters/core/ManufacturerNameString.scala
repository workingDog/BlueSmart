package com.kodekutters.core

import akka.util.ByteString


case class ManufacturerNameString(value: ByteString) {
  def manufacturerNameString() = value.toString()
}
