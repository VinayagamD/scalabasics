package demo.basics.oops

abstract  class Polygon {
   def area:Double
}

object Polygon{

  def main(args: Array[String]): Unit = {
//    var poly = new Polygon
    var rect = new Rectangle(55.2,20.0)
    printArea(rect)
    println(rect.color)
    var tri = new Triangle(55.2,20.0)
    printArea(tri)
    println(tri.color)
  }

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }
}
