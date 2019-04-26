package demo.basics

object HigherOrderMethodsTwo {
  val lst = List(1,2,3, 5, 7, 10 , 13)
  val lst2 = List("A","B","C")

  def main(args: Array[String]): Unit = {
    println(lst.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft((x,y)=> {println(x + " , "+y) ; x+y}))
    println(lst.reduceRight(_ + _))

    println(lst.reduceLeft(_ - _))
    println(lst.reduceRight(_ - _))
    println(lst.reduceRight((x,y)=> {println(x  + " , "+y) ; x-y}))

    println(lst.foldLeft(0)(_ - _))
    println(lst.foldRight(0)(_ - _))
    println(lst.foldLeft(100)(_ + _))
    println(lst.foldRight(100)(_ + _))

    println(lst2.foldLeft("z")(_ + _))

    println(lst.scanLeft(100)(_ + _))
    println(lst2.scanLeft("z")(_ + _))

  }
}
