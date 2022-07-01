package conditionals

fun main() {
    val mode = 2

    when(mode) {
        1 -> println("Lazy")
        2 -> {
            println("Mode 2")
            println("Busy")
        }
        3 -> println("Super-productive")
        else -> println("Mode not found")
    }

    val x = 9

    when(x) {
        5 -> println("x is 5")
        3 * 2 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string")
        in 1..10 -> println("x is between 1 and 10")
        !in 1..9 -> println("x is not between 1 and 9")
        else -> println("Defaults")
    }
}