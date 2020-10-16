object var12 {
  def randomArray(n: Int) = {
    (0 to n map (_ => scala.util.Random.nextInt(20))).toArray
  }

  def countDiffFromAverageBy5(array: Array[Int], avrg: Int): Int = {
    array.count(_ - avrg == 5)
  }

  def diffFromAverageBy5(n: Int) = {
    println("Array of " + n + " elements:")
    val Array = randomArray(n)
    val avrg = Array.sum / Array.length
    println(Array.mkString(","))
    println("Average=" + avrg)
    print("Sum of elements=" + countDiffFromAverageBy5(Array, avrg))
  }

  def main(args: Array[String]) {
    diffFromAverageBy5(10)
  }
}

