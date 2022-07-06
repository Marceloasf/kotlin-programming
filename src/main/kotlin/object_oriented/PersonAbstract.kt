package object_oriented

// Implicit open class
// Cannot be instantiated
abstract class PersonAbstract(open val name: String, open val age: Int) {

    abstract fun greet(name: String)

    open fun speak() {
        println("Hello!")
    }
}

open class StudentAbstract(override val name: String, override val age: Int, private val studentId: Long) :
    PersonAbstract(name, age) {

    fun isIntelligent() = true

    fun getStudentId(): Long = studentId

    override fun greet(name: String) {
        println("$name! My name is ${this.name}, I'm $age years old.")
    }

    override fun speak() {
        println("Hi.")
    }

    fun speakLoudly() {
        super.speak()
    }
}

fun main() {

    val student = StudentAbstract("Jack", 18, 105412)

    student.speak()
    student.speakLoudly()
    student.greet("Teacher")
    println("Is student intelligent? It's ${student.isIntelligent()} (id: ${student.getStudentId()})")
}