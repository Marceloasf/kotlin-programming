package conditionals

fun main() {
    val age = 22
    if (age < 18) {
        println("You cannot register.")
    } else if (age == 21) {
        println("Maybe you can register.")
    } else {
        println("Registered.")
    }

    if (age > 21) println("Adult")

    println("End of if conditionals")
}