package loops

fun main() {

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
}