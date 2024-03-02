fun numberOfOccurrences(input: String): Map<String, Int> {
    val wordOccurrences = mutableMapOf<String, Int>()

    // Podziel zdanie na słowa, uwzględniając polskie znaki
    val words = input.split("\\s+".toRegex())

    for (word in words) {
        // Usuń interpunkcję i zamień na małe litery
        val cleanedWord = word.replace("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ]".toRegex(), "").toLowerCase()

        // Zlicz wystąpienia słów
        val count = wordOccurrences.getOrDefault(cleanedWord, 0)
        wordOccurrences[cleanedWord] = count + 1
    }

    return wordOccurrences
}

fun main() {
    val input: String = "To jest przykładowe zdanie. To zdanie jest tylko przykładowee."
    val result = numberOfOccurrences(input)

    for ((word, count) in result) {
        println("Word: '$word' occurs $count times.")
    }
}
