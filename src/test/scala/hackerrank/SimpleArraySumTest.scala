package hackerrank

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

import hackerrank.SimpleArraySum._

class SimpleArraySumTest extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val cases = Table(
    ("array", "sum"),
    (Array(1,2,3,4), 10),
    (Array[Int](), 0)
  )

  property("simpleSumArray should return sum of all elements") {
    forAll(cases) { (array, sum) =>
      simpleArraySum(array) should be(sum)
      simpleArraySum2(array) should be(sum)
    }
  }

}
