package demo.basics.base_class

class Strict {
  val e ={
    println("strict")
  }
}

class LazyEval{
  lazy val l = {
    println("lazy")
  }
}

object Demo{
  def main(args: Array[String]): Unit = {
    val x = new Strict
    val y = new LazyEval
    println(x.e)
    println(y.l)
    val  add = (a:Int, b: Int)=>{
      println("Add")
      a + b
    }
    method1(add(5,6))
    method2(add(5,6))
  }

  def method1(n :Int): Unit ={
    println("method1")
    println(n)
  }

  def method2(n : => Int){
    println("method2")
    println(n)
  }
}


