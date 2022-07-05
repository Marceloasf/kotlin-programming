package object_oriented

class ContructorPerson(private val name: String, private val age: Int) {
    init {
        println("Object was created")
    }

    fun greet(name: String) {
        println("Hello $name! My name is ${this.name}, I'm $age years old.")
    }
}

fun main() {

    val person = ContructorPerson("Jack", 18)

    person.greet("Tod")
}