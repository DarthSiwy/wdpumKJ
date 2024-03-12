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
        .map { (_, number) -> number * 1 }
}


fun main() {
    println("Zadanie 1");
    val result_1 = lambda("Ala",4)
    println(result_1);

    println("\nZadanie 2");
    val result_2 = suma(listOf(1, -4, 12, 0, -3, 29, -150))
    println(result_2)

    println("\nZadanie 3");
    val result_3 = countElements(listOf( listOf("a", "b", "c"), listOf("c", "d", "f"), listOf("d", "f", "g")))
    println(result_3)

    println("\nZadanie 4");
    val result_4 = evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, -1, 2, 3))
    println(result_4)

}