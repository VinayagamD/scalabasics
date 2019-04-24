package demo.basics.collections

object Maps {

  val myMap: Map[Int,String] =
    Map(801 -> "max", 802 -> "Tom", 803 -> "July",803 -> "July")
  val myMap2: Map[Int,String] =
    Map(805 -> "lau")
  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(801))
//    println(myMap(804)) -> causes exception
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)
    myMap.keys.foreach{ key =>
      println(s"Key : $key")
      println("Value : " + myMap(key) )
    }
    println(myMap.contains(8009))
    println(myMap ++ myMap2)
    println(myMap.size)
  }
}
