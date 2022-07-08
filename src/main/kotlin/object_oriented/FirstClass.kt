package object_oriented

class SimplePerson {

    var name: String = "Sarah"
    var age: Int = 42

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int = 2022 - age
}

fun main() {
    val simplePerson = SimplePerson()
    println(simplePerson.name)
    println(simplePerson.age)

    simplePerson.name = "Peter"
    println(simplePerson.name)

    simplePerson.age = 22
    println(simplePerson.age)

    simplePerson.speak()
    simplePerson.greet("World")

    println(simplePerson.getYearOfBirth())
}