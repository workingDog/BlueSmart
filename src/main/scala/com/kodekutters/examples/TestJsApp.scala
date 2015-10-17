package com.kodekutters.examples

import scala.scalajs.js.JSApp

/**
  * test scala.js
  *
  * see build.sbt and uncomment the appropriate lines
  * see ./project/plugins.sbt and uncomment the appropriate line
  *
  * then just type: sbt run
 */
object TestJsApp extends JSApp {

  def main(): Unit = {
    TestApp.test1()
    TestApp.test2()
  }

}
