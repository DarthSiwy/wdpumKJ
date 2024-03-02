fun numberOfOccurrences(input: String) {
    val words = input.lowercase().split("\\s+".toRegex())
    val wordCountMap = mutableMapOf<String, Int>()

    for (word in words) wordCountMap[word] = wordCountMap.getOrDefault(word, 0) + 1
    for ((word, count) in wordCountMap) println("Word: '$word' occurs $count times.")
}

fun findDuplicates(lst: List<Int>): List<Int> {
    val numbers_without_duplicats = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()

    for (num in lst) {
        if (!numbers_without_duplicats.add(num)) duplicates.add(num)
    }

    val output: List<Int> = duplicates.sorted().toList()
    return output
}

fun addToBoolean(): Map<Int, Boolean> {
    val outputMap = mutableMapOf<Int, Boolean>()
    for (i in 1..20) outputMap[i] = i % 2 == 0
    return outputMap
}


fun main() {
    println("Zadanie 1");
    val input: String = "To jest przykladowe zdanie. To zdanie jest tylko przykladowe."
    numberOfOccurrences(input.lowercase())

    println("\nZadanie 2");
    val lst = listOf(0, 1, 1, 1, 4, 4, 4, 7, 3, 3, 3, 3, 3, 3)
    println(findDuplicates(lst))

    println("\nZadanie 3");
    println(addToBoolean())

}

