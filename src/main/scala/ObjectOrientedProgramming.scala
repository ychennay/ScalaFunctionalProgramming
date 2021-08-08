package main.scala

/*
Create a Writer class that has a first name, last name, and year,
with a method for a full name.
 */
class Writer(firstName: String, lastName: String, val year: Int) {

  def fullName: String = firstName + ' ' + lastName
}

/*
Create a Novel class that has a name, year of release, and author.
 */
class Novel(name: String, year: Int, author: Writer) {

  def authorYear: Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

/*
Counter class
- receives an integer value
- method for current count
- method to increment/decrement => new Counter
- overload increment/decrement to receive an amount
 */
class Counter(count: Int) {
  def inc = new Counter(count + 1)

  def dec = new Counter(count - 1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

}


object object_oriented_programming extends App {

  val author = new Writer("Charles", "Dickens", 1812)

  val novel = new Novel("Great Expectations", 1861, author)

  println(author.fullName)
  println(novel.isWrittenBy(author))
  println(novel.authorYear)

  val counter = new Counter(2)
  val newCounter = counter inc 1 // infix notation for calling method w/ one argument


}
