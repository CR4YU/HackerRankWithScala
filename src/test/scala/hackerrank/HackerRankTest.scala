package hackerrank

import org.scalatest._
import prop._

class HackerRankTest extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val solveMeFirstCases = Table(
    ("a", "b", "c"),
    (1, 2, 3)
  )

  property("solveMeFirst should return sum of two numbers") {
    forAll(solveMeFirstCases) { (a, b, c) =>
      c should be(HackerRank.solveMeFirst(a,b))
      c should be(HackerRank.solveMeFirst2(a,b))
    }
  }


}
