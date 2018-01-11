object Day01 {

    fun part1(input: String): Int {
        return solution(input, 1)
    }

    fun part2(input: String): Int {
        return solution(input, input.length / 2)
    }

    private fun solution(input: String, comparePos: Int): Int {
        var sum = 0
        input.forEachIndexed { index, char ->
            val convertInt = char.convertToInt()
            val nextIndex = input[(index + comparePos) % (input.length)].convertToInt()
            if (convertInt == nextIndex) {
                sum += convertInt
            }
        }
        return sum
    }

}

fun Char.convertToInt() = Integer.parseInt(this.toString())