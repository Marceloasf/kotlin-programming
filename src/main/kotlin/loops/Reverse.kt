package loops

fun main() {

    val numbers = listOf(1, 2, 3, 6, 8, 9)

    println(reverse(numbers))
    println(reverseTwo(numbers))
}

fun reverse(list: List<Int>): List<Int> {

    val result = arrayListOf<Int>()
    for (i in list.indices) {
        result.add(list[list.size - 1 - i])
    }
    return result
}

fun reverseTwo(list: List<Int>): List<Int> {

    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}