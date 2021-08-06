package main.scala

object currying {

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    // return a function that takes in a
    (a: A) => (b: B) => f(a, b)

  }

  def main(args: Array[String]): Unit = {
    val curriedFunction = curry((arg1: Int, arg2: String) => {
      arg1
    })
    println(curriedFunction(4))
  }

}
