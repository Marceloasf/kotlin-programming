package object_oriented

abstract class Course(private val topic: String, private val price: Double) {
    open fun learn() {
        println("Learning $topic course, that costs $price")
    }
}

interface Learnable {
    fun learn() {
        println("Learning something...")
    }
}

// final defines that it can't be overriden by subtypes of KotlinCourse
open class KotlinCourse : Course("Kotlin", 999.99), Learnable {
    final override fun learn() {
        super<Course>.learn()
        println("Learning...")
        super<Learnable>.learn()
    }
}

fun main() {

    val course = KotlinCourse()
    course.learn()
}