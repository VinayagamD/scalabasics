package demo

object Demo {
  def main(args: Array[String]): Unit ={
    val name = "vinay"
    val age = 18
    println(name +" is "+age +" years old" )
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old")
    println(s"Hello \n world")
    println(raw"Hello \n World")
  }
}
