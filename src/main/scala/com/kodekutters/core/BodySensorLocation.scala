package com.kodekutters.core

import akka.util.ByteString


sealed trait Location
object Location {
  case object Other extends Location
  case object Chest extends Location
  case object Wrist extends Location
  case object Finger extends Location
  case object Hand extends Location
  case object Ear_Lobe extends Location
  case object Foot extends Location
}

case class BodySensorLocation(value: ByteString) {

   import Location._

   val bodySensorLocation = GattUtils.asByteBuffer(value).get() match {
     case 0 => Other
     case 1 => Chest
     case 2 => Wrist
     case 3 => Finger
     case 4 => Hand
     case 5 => Ear_Lobe
     case 6 => Foot
     case _ => Other
   }

}