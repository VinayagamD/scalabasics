package demo.basics.collections

object Lists {

  val myList: List[Int] = List(1,2,5,8,9,6,4)
  val names: List[String] = List("Max", "Tom","John")

  def main(args: Array[String]): Unit = {
    println(myList)
    println(names)
    println(0 :: myList)
    println(1 :: 5:: 9 :: Nil)
    println(myList.head)
    println(names.isEmpty)
    println(myList.tail)
    println(myList.reverse)
    println(List.fill(5)(2))
    println(myList.max)
    myList.foreach(println)
    var sum : Int = 0
    myList.foreach(sum += _)
    println(sum)
    for(name <- names)
      println(name)
    println(names(0))
  }
}
