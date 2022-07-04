package loops

fun main() {

    for (c in "Python") {
        if (c == 'o') {
            break
        }
        print(c)
    }

    println()

    val list = listOf("Book", "Table", "Laptop")

    for (str in list) {
        if (!str.contains('o')) {
            continue
        }
        println(str)
    }
}