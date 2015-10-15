package com.kodekutters.examples

import com.kodekutters.core._

/**
  * test app
 */
object TestApp {

  def main(args: Array[String]) {
    test1()
    test2()
  }

  def test2(): Unit = {
    println("GattUnits")
    GattUnits.attributes.foreach(x => println("key: " + x._1 + " value: " + x._2))
  }

  def test1(): Unit = {
    println("Declarations")
    Declarations.attributes.foreach(x => println("key: " + x._1 + " value: " + x._2))
    println("Service")
    Service.attributes.foreach(x => println("key: " + x._1 + " value: " + x._2))
    println("Descriptor")
    Descriptor.attributes.foreach(x => println("key: " + x._1 + " value: " + x._2))
    println("Characteristic")
    Characteristic.attributes.foreach(x => println("key: " + x._1 + " value: " + x._2))
  }

}
