package main.scala

object AdvancedCurrying extends App {

  def simpleMethod(x: Int, y: Int): Int = x + y

  def simpleFunction = (x: Int, y: Int) => x + y

  def curriedAdd(x: Int)(y: Int): Int = x + y

  val add3: Int => Int = curriedAdd(3)
  val add4 = curriedAdd(4) _
  val add5 = (x: Int) => simpleMethod(x, 5)
  val add6 = simpleFunction.curried(6)

  print(add3(5))
  print(add4(5))

  def concatenateName(a: String, b: String, c: String) = a + b + c


}
