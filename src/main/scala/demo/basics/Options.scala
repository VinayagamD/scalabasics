package demo.basics

// Options (Some or None)
object Options {

  val lst = List(1,2,3)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")
  val opt:Option[Int] = None
  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 6))
    println(lst.find(_ > 6).getOrElse(0))
    println(lst.find(_ > 2).get)
    println(map.get(5).getOrElse("No name Found"))
    println(opt.isEmpty )
  }
}
