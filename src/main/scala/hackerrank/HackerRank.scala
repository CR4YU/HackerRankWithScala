package hackerrank

object HackerRank {

  /**
    * Solve me first
    * hackerrank.com/challenges/solve-me-first
    */
  def solveMeFirst(a: Int, b: Int): Int = a + b
  val solveMeFirst2: (Int, Int) => Int = _ + _


  /**
    * Simple Array Sum
    * hackerrank.com/challenges/simple-array-sum
    */
  def simpleArraySum(array: Array[Int]): Int = array.sum
  def simpleArraySum2(array: Array[Int]): Int = {
    var sum = 0
    array.foreach(i => sum += i)
    sum
  }

}
