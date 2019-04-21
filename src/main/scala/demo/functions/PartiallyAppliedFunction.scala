package demo.functions

import java.util.Date

object PartiallyAppliedFunction {

  def log(date: Date, message: String)={
    println(s"$date   $message")
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int,b: Int,c: Int) => a+b+c
//    val f = sum(10,20, _:Int)
    val f = sum(10,_: Int, _:Int)
//    println(f(200))
    println(f(100,200))
    val date = new Date
    val newLog = log(date, _:String)
    newLog("This is message 1")
    newLog("This is message 2")
    newLog("This is message 3")
    newLog("This is message 4")
    newLog("This is message 5")

  }
}
