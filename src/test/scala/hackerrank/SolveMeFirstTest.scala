package hackerrank

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

import hackerrank.SolveMeFirst._

class SolveMeFirstTest extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val cases = Table(
    ("a", "b", "c"),
    (1, 2, 3),
    (5, 5, 10),
    (-100, 100, 0)
  )

  property("solveMeFirst should return sum of two numbers") {
    forAll(cases) { (a, b, c) =>
      solveMeFirst(a,b) should be(c)
      solveMeFirst2(a,b) should be(c)
    }
  }

}
