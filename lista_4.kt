fun lambda(s: String, i:Int): String {
    if (i < 0) return "negative number given"
    return s.repeat(i);
}

fun suma(a: List<Int>): Int {
    return a.filter { it > 0 }.sum()
}

fun countElements(input: List<List<String>>): Map<String, Int> {
    return input.flatten()
        .groupingBy { it }
        .eachCount()
}

fun evenPositiveSquare(numbers_list: List<Int>): List<Int> {
    return numbers_list.withIndex()
        .filter { (index, _) -> index % 2 != 0 }
        .filter { (_, number) -> number > 0}
        .map    { (_, number) -> number * number}
}

fun srt(input: List<String>): List<Pair<Char, List<String>>> {
    return input.groupBy { it.first().lowercaseChar() }
        .toList()
        .sortedBy { it.first }
        .map { Pair(it.first, it.second.sorted().filter{ it.length % 2 == 0 }) }
}

fun main() {
    val results = listOf(
        lambda("Ala",4),
        suma(listOf(1, -4, 12, 0, -3, 29, -150)),
        countElements(listOf( listOf("a", "b", "c"), listOf("c", "d", "f"), listOf("d", "f", "g"))),
        evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, -1, 2, 3)),
        srt(listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut"))
    )

    results.forEachIndexed { index, result ->
        println("Zadanie ${index + 1}\n$result\n")
    }
}