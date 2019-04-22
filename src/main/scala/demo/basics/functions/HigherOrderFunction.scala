package demo.basics.functions

object HigherOrderFunction {

  def math(x:Double, y:Double, f:(Double, Double)=>Double):Double=f(x,y)
  def math(x:Double, y:Double, z:Double, f:(Double, Double)=>Double):Double=f(f(x,y),z)

  def main(args: Array[String]): Unit = {
//    val result = math(50, 20, (x,y)=>x+y)
//    val result = math(50, 20, (x,y)=>x*y)
//    val result = math(50, 20, (x,y)=>x min y)
//    val result = math(50, 20, 10 ,(x,y)=>x+y)
//    val result = math(50, 20, 10 ,(x,y)=>x*y)
//    val result = math(50, 20, 10 ,(x,y)=>x min y)
//    val result = math(50, 20, 10 ,(x,y)=>x max y)
//    val result = math(50, 20, 10 ,_+_)
    val result = math(50, 20, 10 ,_ max _)
    println(result)
  }
}
