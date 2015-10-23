package com.kodekutters.examples

import scala.scalajs.js.JSApp

/**
  * test scala.js   ... todo
  *
  * see build.sbt and uncomment the appropriate lines
  * see ./project/plugins.sbt and uncomment the appropriate line
  *
  * then just type: sbt run
 */
object TestJsApp extends JSApp {

  def main(): Unit = {
    TestApp.test1()
  }

}
