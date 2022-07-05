package functions

import java.util.Date

// No parameters, no return value
fun helloWorld() {
    println("Hello World!")
}

// 1 parameter, no return value
fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

// No parameters, returns Date
fun getCurrentDate(): Date {
    return Date()
}

// 2 parameters, returns Int
fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    }

    return b
}

fun main() {
    helloWorld()
    printWithSpaces("Kotlin!")
    println(getCurrentDate())
    println(max(17, 42))
}