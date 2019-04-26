package demo.basics.base_class

 class User (var name: String, var age: Int){
  def init(): Unit ={
    this.name = name
    this.age = age
  }
  def this(){
    this("Vinay",27)
  }

  def this(name:String){
    this(name,27)
  }
}

