package demo.basics.collections

import Array._

object MyArrays {

  val myArray: Array[Int] = new Array[Int](4)
  val myArray2 = new Array[Boolean](5)
  val myArray3 = Array(1,2,3,4,5,6,8)

  def main(args: Array[String]): Unit = {
    myArray(0) = 20
    myArray(1) = 50
    myArray(2) = 10
    myArray(3) = 30
    println(myArray)
//    Normal Foreach
    println("normal foreach")
    for (x <- myArray)
      println(x)
//    Lambda Function
    println("lambda function")
    myArray.foreach(x => println(x))

//    Another way
    println("Index based")
    for (i <- 0.until(myArray.length))
      println(myArray(i))

    myArray2.foreach(x => println(x))
    myArray3.foreach(x => println(x))

    val result = concat(myArray,myArray3)
    result.foreach(x => println(x))
  }
}
