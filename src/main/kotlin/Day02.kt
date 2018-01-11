object Day02 {

  fun part1(input: String): Int {
    var checkSum = 0
    val lines = input.split("\n")
    lines.forEach {
      println("numbers:$it")
      val numbers = it.split("\t").map { Integer.parseInt(it) }
      checkSum += (numbers.max()!! - numbers.min()!!)
    }
    return checkSum
  }

  fun part2(input: String): Int {
    TODO()
  }

}