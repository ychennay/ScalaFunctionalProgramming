package main.scala

object IteratorExample {

  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(5)
    println(iterator.next())
    println(iterator.next())
  }

}
