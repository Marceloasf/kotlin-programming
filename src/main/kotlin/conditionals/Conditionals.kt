package conditionals

fun main() {
    val mode = 2

    val result = when(mode) {
        1 -> "Lazy"
        2 -> "Mode 2"
        3 -> "Super-productive"
        else -> "Mode not found"
    }

    println(result)

    val x = if (mode < 2) {
        println("Mode is less than 2")
        17
    } else {
        42
    }

    println(x)
}