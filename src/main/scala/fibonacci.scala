package main.scala

import scala.annotation.tailrec

object fibonacci {

  def main(args: Array[String]): Unit = {
    println(fibonacci(5))
    println(fibonacciTailRecursive(5))

  }

  def fibonacci(n: Int): Int = {
    if (n < 2) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciTailRecursive(n: Int): Int = {

    /*
    Fibonacci tail recursive implementation that uses tail recursion. The call to the recursive function
    passes in the last two values of the fibonacci sequence.
     */

    @tailrec def getTailRecursion(index: Int, prev: Int, current: Int): Int = {
      println("Index:", index, "Prev:", prev, "current:", current)
      if (index <= 0) {
        println("Returning", current)
        current
      } else {
        getTailRecursion(index - 1, prev + current, prev)
      }
    }

    getTailRecursion(n, 1, 0)
  }

}
