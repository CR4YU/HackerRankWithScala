package hackerrank

import org.scalatest._
import prop._

import HackerRank._

class HackerRankTest extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val solveMeFirstCases = Table(
    ("a", "b", "c"),
    (1, 2, 3),
    (5, 5, 10),
    (-100, 100, 0)
  )

  property("solveMeFirst should return sum of two numbers") {
    forAll(solveMeFirstCases) { (a, b, c) =>
      solveMeFirst(a,b) should be(c)
      solveMeFirst2(a,b) should be(c)
    }
  }


  val simpleSumArray = Table(
    ("array", "sum"),
    (Array(1,2,3,4), 10),
    (Array[Int](), 0)
  )

  property("simpleSumArray should return sum of all elements") {
    forAll(simpleSumArray) { (array, sum) =>
      simpleArraySum(array) should be(sum)
      simpleArraySum2(array) should be(sum)
    }
  }

}
