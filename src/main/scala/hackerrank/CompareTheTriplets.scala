package hackerrank

/**
  * Compare the Triplets
  * hackerrank.com/challenges/compare-the-triplets
  */
object CompareTheTriplets {

  def compareTheTriplets(a: Array[Int], b: Array[Int]): (Int, Int) = {
    var alice, bob = 0
    for (i <- a.indices) {
      if (a(i) > b(i)) alice += 1
      else if (a(i) < b(i)) bob += 1
    }
    (alice, bob)
  }

  def compareTheTriplets2(alice: Array[Int], bob: Array[Int]): (Int, Int) = {
    alice.zip(bob).map { case (a, b) =>
      if (a > b) (1,0)
      else if (b > a) (0,1)
      else (0,0)
    }.reduce( (t1,t2) => (t1._1 + t2._1, t1._2 + t2._2))
  }

}
