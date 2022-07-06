package object_oriented

open class PersonInheritance(open val name: String, open val age: Int) {

    fun greet(name: String) {
        println("Hello $name! My name is ${this.name}, I'm $age years old.")
    }
}

class Student(override val name: String, override val age: Int, private val studentId: Long): PersonInheritance(name, age) {

    fun isIntelligent() = true

    fun getStudentId(): Long = studentId
 }

class Employee(override val name: String, override val age: Int): PersonInheritance(name, age) {

    fun receivePayment() {
        println("Receive payment.")
    }
}

fun main() {

    val student = Student("Jack", 18, 105412)
    val employee = Employee("Jack's Dad", 46)

    student.greet("Dad")
    employee.greet(student.name)

    println("Is student intelligent? It's ${student.isIntelligent()} (id: ${student.getStudentId()})")
    employee.receivePayment()
}