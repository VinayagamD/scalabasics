package demo.functions

object Closures {

  val number = 10
//  val add = (x: Int) => x + 10
  val add = (x: Int) => {
    x+number
  }

  def main(args: Array[String]): Unit = {
    println(add(20))
    println(number)
  }

}
