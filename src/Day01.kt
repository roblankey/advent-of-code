fun main() {
    val elves = mutableListOf<Int>()

    fun part1(input: List<String>) {
        var calories = 0

        input.forEach {
            if (it.isEmpty()) {
                elves.add(calories)
                calories = 0
            } else {
                calories += it.toInt()
            }
        }
    }

    // load data into list
    part1(readInput("Day01"))

    // most calories carried by an elf
    println(elves.max())

    // total calories carried by top 3 elves
    elves.sortDescending()
    println(elves[0] + elves[1] + elves[2])
}
