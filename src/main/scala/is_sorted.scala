package main.scala

import scala.annotation.tailrec

/*
Exercise 2.2
Implemented isSorted, which checks with an Array[A] is sorted according to a given comparison function:

def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean
 */

object is_sorted {

  /*
  Implements a sorting function on an array of type T. Takes in an ordered sorting function
  that compares two arguments of type T, and returns True if one is larger than the other.
   */
  def isSorted[T](as: Array[T], ordered: (T, T) => Boolean): Boolean = {

    @tailrec
    def loop(n: Int): Boolean = {
      //println("N is ", n)
      if (n >= as.length) true
      else if (n >= 1) {
        //println("Checking ", as(n), " and ", as(n - 1))
        val isOrdered = ordered(as(n - 1), as(n))
        //println("Ordered:", isOrdered)
        if (isOrdered) loop(n + 1)
        else false
      } else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val sortedTestArray = Array(1, 2, 3, 4)
    val unsortedTestArray = Array(4, 3, 2, 1)
    println(isSorted(sortedTestArray, (a: Int, b: Int) => a <= b))
    println(isSorted(unsortedTestArray, (a: Int, b: Int) => {
      println("a is ", a, " while b is ", b)
      a < b
    }))
  }
}
