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
        .filter { (index, number) -> index % 2 != 0 }
        .filter { (index, number) ->  number > 0}
        .map    { (_,   number) -> number * number}
}

fun srt(input: List<String>): List<Pair<Char, List<String>>> {
    return input.groupBy { it.first().toLowerCase() }
        .toList()
        .sortedBy { it.first }
        .map { Pair(it.first, it.second.sorted().filter{ it.length % 2 == 0 }) }
}

fun main() {
    val result_1 = lambda("Ala",4)
    val result_2 = suma(listOf(1, -4, 12, 0, -3, 29, -150))
    val result_3 = countElements(listOf( listOf("a", "b", "c"), listOf("c", "d", "f"), listOf("d", "f", "g")))
    val result_4 = evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, -1, 2, 3))
    val result_5 = srt(listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut"))

    println("Zadanie 1\n"+result_1+"\n");
    println("Zadanie 2\n"+result_2+"\n");
    println("Zadanie 3\n"+result_3+"\n");
    println("Zadanie 4\n"+result_4+"\n");
    println("Zadanie 5\n"+result_5+"\n");
}