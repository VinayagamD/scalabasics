package demo.basics.base_class

case class MyUser (
              name: String,
            age: Int
           )

object TestUser{
  def main(args: Array[String]): Unit = {
    var user = MyUser("Vinay",27)
    println(user.name)
    println(user.age)
  }
}

