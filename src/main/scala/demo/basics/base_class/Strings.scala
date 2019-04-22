package demo.basics.base_class

object Strings {
  val num1 = 75
  val num2 = 100.25
  val str : String = "Hello World"
  val str2 : String = "Max"

  def main(args: Array[String]): Unit = {
    println(str.length())
    println(str.concat(str2))
    println(str + str2)

    val result = printf("(%d -- %f -- %s)",num1,num2,str)
    println(result)
    println("(%d -- %f -- %s)".format(num1, num2, str))


  }
}
