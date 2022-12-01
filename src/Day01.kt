fun main() {
    fun part1(input: List<String>): Int {
        var calories = 0
        val elves = mutableListOf<Int>()

        input.forEach {
            if (it.isEmpty()) {
                elves.add(calories)
                calories = 0
            } else {
                calories += it.toInt()
            }
        }

        return elves.max()
    }

    val input = readInput("Day01")
    println(part1(input))
}
