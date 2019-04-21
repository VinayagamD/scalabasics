package demo

object ControlStatement1 {

  def main(args: Array[String]): Unit = {
    /*type1()
    type2()
    type3()
    whileEx()
    doWhileEx()
    forEx()*/
    matchEx()
  }

  def type1(): Unit ={
    val x = 20
    if(x == 20){
      println("x == 20")
    }else{
      println("x != 20")
    }
  }

  def type2(): Unit ={
    val x = 20
    var res = ""
    if(x == 20){
      res ="x == 20"
    }else{
      res = "x != 20"
    }

    println(res)
  }

  def type3(): Unit ={
    val x = 20
    val res = if(x==20) "x == 20" else "x!=20"
    println(res)
  }

  def whileEx(): Unit ={
    var x =0
    while(x < 10){
      println(s"X = $x")
      x += 1
    }
  }

  def doWhileEx(): Unit ={
    var y = 0
    do{
      println(s"y = $y")
      y+=1
    }while(y<10)
  }

  def forEx(): Unit ={
    for( i <- 1 to 5){
      println(s" i using to = $i")
    }
    for( i <- 1.to(5)){
      println(s" i using .to = $i")
    }
     for( i <- 1.until(5)){
      println(s" i using .until = $i")
    }

    for( i <- 1 to 9 ; j <- 1 to 3){
      println(s"i using to $i ; j using to $j")
    }

    val lst = List(1,2,3,4,5,6,78,9,6,5)
    for(i <- lst)
      println(s"i using lst $i")
    for(i <- lst ; if i< 6)
      println(s"i using lst for less than (6)  $i")

    val result = for{
      i <- lst
      if i < 6} yield{
       i*i
    }

    println("result = "+result)
  }

  def matchEx(): Unit ={
    val age = 18
    age match{
      case 20 => println(age)
      case 18 => println(age)
      case 30 => println(age)
      case 40 => println(age)
      case 50 => println(age)
      case 60 => println(age)
      case _ => println("default")
    }

    val ageStr = "50"
    ageStr match{
      case "20" => println(ageStr)
      case "18" => println(ageStr)
      case "30" => println(ageStr)
      case "40" => println(ageStr)
      case "50" => println(ageStr)
      case _ => println("default")

    }

    val result =  ageStr match{
      case "20" => ageStr
      case "18" => ageStr
      case "30" => ageStr
      case "40" => ageStr
      case "50" => ageStr
      case _ =>"default"
    }
    println(result)

    val i = 7
    i  match {
      case 1| 3 | 5| 7| 9 => println("odd")
      case 2| 4 | 6| 8| 20 => println("even")
    }
  }




}
