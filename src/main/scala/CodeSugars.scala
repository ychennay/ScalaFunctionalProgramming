package main.scala

object CodeSugars extends App {

  /*
  You can use a code block for single argument methods
   */
  def singleArgMethod(number: Int) = {
    println(s"The number used was $number.")
    number + 1
  }

  singleArgMethod {
    var runningTotal = 0
    for (i <- 1 to 10){
      runningTotal = runningTotal + i
    }
    runningTotal
  }

  trait Callable {
    def call(v: Int): Int
  }

  val callable = new Callable {
     override def call(v: Int): Int = {
      1 + v
    }
  }

  val otherCallable: Callable = (x => x + 1)
  println(otherCallable.call(2))



}
