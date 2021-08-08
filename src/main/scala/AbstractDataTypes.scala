package main.scala

object AbstractDataTypes extends App {

  abstract class Company {
    val name: String
    val netWorth: Int
    val businessType: String
    val isPublic: Boolean

    def acquire(anotherCompany: Company): Company
  }

  trait GonePublic {
    def fileForIPO(): Unit

    val stockPrice: Float
  }

  class LLC extends Company {
    override val name: String = "Yu Chen Consulting"
    override val netWorth: Int = 1000
    override val businessType: String = "Limited Liability"

    override def acquire(anotherCompany: Company): Company = this

    override val isPublic: Boolean = false
  }

  class LargeTechCompany(companyName: String, companyNetWorth: Int) extends Company with GonePublic {
    override val name: String = companyName
    override val netWorth: Int = companyNetWorth
    override val businessType: String = "global tech"
    override val isPublic: Boolean = true

    override def acquire(anotherCompany: Company): Company = ???

    override def fileForIPO(): Unit = {
      print(s"The company $name is filing for IPO!")

    }

    override val stockPrice: Float = 2.2f
  }
}
