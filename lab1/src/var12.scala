object var12 {
  def randomArray(n: Int) = {
    val Array = new Array[Int](n)
    println("Array of " + n + " elements:")
    for (i <- 0 until Array.length) {
      Array(i) = scala.util.Random.nextInt(20)
      print(Array(i) + " ")
    }
    println()
    Array
  }

  def diffFromAverageBy5(n: Int) = {
    val Array = randomArray(n)
    val avrg = Array.sum / Array.length
    println("Average=" + avrg)
    var sum = 0
    println("New Array:")
    for (i <- 0 until Array.length) {
      if (Math.abs(Array(i) - avrg) >= 5)
        sum += 1
      print(Array(i) + " ")
    }
    println()
    print("Sum of elements=" + sum)
  }

  def main(args: Array[String]) {
    diffFromAverageBy5(40)
  }
}
