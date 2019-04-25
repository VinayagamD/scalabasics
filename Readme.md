# This Repository Helps to learn about Scala Basics

**Scala Called _Scalabale Language_**

> * It is a JVM Based language.
> * Built for Scalability.
> * Completely Object Oriented.
> * Functional based language.

___

### Application

* Backend
  * [Playframework](https://www.playframework.com/)
* Big Data
  * [Apache Spark](https://spark.apache.org/downloads.html)
___

### Environment

* SDK
  * [Scala](https://www.scala-lang.org/download/)
  * [SBT](https://www.scala-sbt.org/download.html)
  * [JDK](https://www.oracle.com/technetwork/java/javaee/downloads/jdk8-downloads-2133151.html)
* IDE
  * [Eclipse](https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-ee-developers)
  * [Scala IDE](http://scala-ide.org/download/sdk.html)
  * [Intellij](https://www.jetbrains.com/idea/download/#section=windows) _I have used this you can use any one of above choice_
  
___

#### Repository covers basics topic on Scala

* SBT Project
* Basics
  * Hello World
  * String Intepolation
  * Control Statement
    * Conditional
      * if
      * if Else
      * match
    * Looping
      * while
      * do while
      * for
        * to/.to
        * until/.until
        * list
  * Functions
    * Function Example
    * With return
    * Default return
    * Single line
    * Default Variable
    * Annonymous Function
    * Higher Order Function
      * >Function that takes input as one or more function and returns result of that function is called higher order function
    * Partilally Applied Function
      * > Creating Variable other function with partial params filled and some params with _ for further usage
    * Closures
      * > It is a function which uses one or more variables declared outside the function
    * Currying
      * > It is a technique of transforming fucntion that takes multiple arguments into a function that takes a single function
  * Strings
    * length()
    * concat()
    * str + str
    * format()
  * Collections
    * Array
      * for (a <- arr)
      * .foreach()
      * .to
      * .length
      * .concat
    * List
      * List()
      * List[Generics]
      * .head
      * .tail
      * .isEmpty
      * .reverse
      * .fill(_no of times_)(_value_)
      * .max
      * .foreach
      * <-
    * Sets
      * Set()
      * mySet(check value exists)
      * +/.+
      * .head
      * .tail
      * .isEmpty
      * ++/.++
      * .& / &
      * .intersect/intersect
      * max/.max
      * min/.min
      * foreach
      * <-
    * Maps
      * Map()
      * myMap(key)
      * .keys
      * .values
      * .isEmpty
      * .contains
      * .++/++
      * .size
  * Tuples
    * ()
    * Tuple[n](1 .. n) _n -> No of Element_
    * tuples._p _p-> Position of the Element_
    * .productIterator
  * Options
    * None
    * Some
    * .get
    * .getOrELse
    * .isEmpty
    * .find -> retuns Some / None -> use .get to get a value
    * .isEmpty
  * Higher Order Methods
    * .map
    * .mapValues
    * .flatten
    * .flatmap
    * .filter