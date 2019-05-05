package hackerrank

/**
  * Simple Array Sum
  * hackerrank.com/challenges/simple-array-sum
  */
object SimpleArraySum {

  def simpleArraySum(array: Array[Int]): Int = array.sum

  def simpleArraySum2(array: Array[Int]): Int = {
    var sum = 0
    array.foreach(i => sum += i)
    sum
  }

}
