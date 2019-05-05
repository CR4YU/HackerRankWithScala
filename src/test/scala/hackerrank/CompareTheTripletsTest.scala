package hackerrank

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

import hackerrank.CompareTheTriplets._

class CompareTheTripletsTest extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val cases = Table(
    ("a", "b", "expected"),
    (Array(1,2,3), Array(3,2,1), (1,1)),
    (Array(17,28,30), Array(99,16,8), (2,1)),
    (Array(5,6,7), Array(3,6,10), (1,1))
  )

  property("compareTheTriplets should properly compare points") {
    forAll(cases) { (a, b, expected) =>
      compareTheTriplets(a, b) should be(expected)
      compareTheTriplets2(a, b) should be(expected)
    }
  }

}
