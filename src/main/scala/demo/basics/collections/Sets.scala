package demo.basics.collections

object Sets {

  val mySets:Set[Int] = Set(1,2,5,8,9, 6, 4, 4)
  val mySets2:Set[Int] = Set(4,2,9,18,19,16,14)
  val names:Set[String] = Set("Max","Tom", "John")
  def main(args: Array[String]): Unit = {
    println(mySets)
    println(mySets + 10)
    println(mySets(8))
    println(names("Max"))
    println(mySets.head)
    println(mySets.tail)
    println(mySets.isEmpty)
    println(mySets ++ mySets2)
    println(mySets.++(mySets2))
    println(mySets.&(mySets2))
    println(mySets.intersect(mySets2))
    println(mySets.max)
    println(mySets.min)
    mySets.foreach(println)
    for (name <- names)
        println(name)
  }

}
