package demo.basics

object Tuples {

  private val myTuple = (1,2,"Hello", true)
  private val myTuple2 = Tuple3(1, 2, "Hello")
  private val myTuple3 = Tuple2(1 , "Hello")
  private val myTuple4 = Tuple3(1 , "Hello",(2,3))

  def main(args: Array[String]): Unit = {
    println(myTuple)
    println(myTuple2)
    println(myTuple3)
    println(myTuple._1)
    println(myTuple._2)
    println(myTuple._3)
    println(myTuple._4)
    println(myTuple2._3)

    myTuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "Tom")
    println(1 -> "Tom" -> "Hello")

    println(myTuple4._3._2)
  }
}
