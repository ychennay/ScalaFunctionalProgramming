package sequences

object SequenceExamples extends App {

  val aSequence = Seq(1,2,3,4)
  println(aSequence ++ aSequence)

  val aTuple = (1, "Hello", 3)
  println(aTuple.productArity)

}
