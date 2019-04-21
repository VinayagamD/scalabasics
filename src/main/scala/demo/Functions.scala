package demo

object Functions {

  def main(args: Array[String]): Unit = {
    println(Math.add(45,15))
    println(subtract(45,15))
    println(multiply(45,15))
    println(divide(45,15))
    println(Math square 2)
    println(Math.+(35,15))
    println(Math ** 6)
    println(Math.add())
    println(Math.add(60))
  }

  object Math {
    def add(x: Int = 25, y: Int = 15): Int = {
      x + y
    }

    def +(x: Int, y: Int):Int = x+y
    def **(x:Int):Int = x*x
    def square(x:Int): Int = x*x
  }

  def subtract(x: Int, y:Int): Int = x-y
  def multiply(x: Int, y:Int): Int = x*y
  def divide(x: Int, y:Int): Int = x/y

}
