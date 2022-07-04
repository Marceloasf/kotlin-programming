package collections

fun main() {

    // Fixed length
    val statesArray = arrayOf("Paraná", "São Paulo", "Minas Gerais")
    val mixedArray = arrayOf("Kotlin", 17, false, 3.0)

    // Specified type arrays
    val numbers = intArrayOf(1,2,3,4,5)

    println(numbers[0])

    println(mixedArray[0])

    println(mixedArray[3])

    // Alter values directly
    mixedArray[3] = 3.1415

    println(mixedArray[3])

    // We can treat strings as arrays
    val str = "Kotlin"
    println(str[0])

    val otherStatesArray = arrayOf("Rio Grande do Sul")

    // Concat Arrays
    val allStatesArray = statesArray + otherStatesArray

    println(allStatesArray.size)

    // Immutable
    val colorsList = listOf("Orange", "Apple", "Bananas")
    // colorsList.add - does not exist
    println(colorsList.size)

    // Mutable - Works like Java ArrayList
    val namesArrayList = arrayListOf("Patrick", "Michael", "Sarah")
    namesArrayList.add("Sandra")

    println(namesArrayList.size)

}