object Day02 {

    fun part1(input: String): Int {
        var checkSum = 0
        val lines = input.split("\n")
        lines.forEach {
            val numbers = it.split("\t").map { Integer.parseInt(it) }
            checkSum += (numbers.max()!! - numbers.min()!!)
        }
        return checkSum
    }

    fun part2(input: String): Int {
        var checkSum = 0
        val lines = input.split("\n")
        lines.forEach {
            val (x, y) = findDivisors(it.split("\t").map { Integer.parseInt(it) })
            checkSum += (x / y)
        }
        return checkSum
    }

    private fun findDivisors(numbers: List<Int>): Pair<Int, Int> {
        numbers.forEachIndexed { i, x ->
            numbers.forEachIndexed { j, y ->
                if (i != j) {
                    if (x % y == 0) {
                        return Pair(x, y)
                    }
                }
            }
        }
        throw IllegalArgumentException("List does not contain ints that divide into each other. Numbers:$numbers")
    }

}