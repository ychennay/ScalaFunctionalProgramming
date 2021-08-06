package main.scala

import scala.annotation.tailrec

object polymorphic {

  /*
  Example of a monomorphic function (accepts only String types)
   */
  def findFirst(ss: Array[String], key: String): Int = {

    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }

    loop(0)
  }

  /*
  Accept an array of a generic type T. Accept a function p that takes in a single
  argument of type T and returns a Boolean
   */
  def findFirstPolymorphic[T](as: Array[T], p: T => Boolean): Int = {

    @tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {

    val sampleArray = Array("a", "b", "c", "d")

    println(findFirst(sampleArray, "c")) // example with monomorphic function
    println(findFirstPolymorphic(sampleArray, (x: String) => x == "d")) // example with strings
    println(findFirstPolymorphic(Array(1, 2, 3, 4), (x: Int) => x == 4)) // example with integers
  }

}
