fun numberOfOccurrences(input: String) {
    val words = input.lowercase().split("\\s+".toRegex())
    val wordCountMap = mutableMapOf<String, Int>()

    for (word in words) {
        wordCountMap[word] = wordCountMap.getOrDefault(word, 0) + 1
    }

    for ((word, count) in wordCountMap) {
        println("Word: '$word' occurs $count times.")
    }
}

fun main() {
    val input: String = "To jest przykladowe zdanie. To zdanie jest tylko przykladowe."
    numberOfOccurrences(input.lowercase())
}

