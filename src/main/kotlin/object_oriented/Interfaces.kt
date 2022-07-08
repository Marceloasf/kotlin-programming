package object_oriented

interface Driveable {
    // Every method and property is implicitly abstract inside an interface - can add default implementations to methods
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(private val color: Colors) : Driveable, Buildable {

    override val timeRequired: Int = 120

    override fun drive() {
        println("Driving $color car...")
    }

    override fun build() {
        println("Build a shiny car.")
    }
}

class Motorcycle(private val color: Colors) : Driveable {

    override fun drive() {
        println("Driving $color motorcycle...")
    }
}

fun main() {
    val car: Driveable = Car(Colors.BLUE)
    car.drive()

    val motorcycle: Driveable = Motorcycle(Colors.RED)
    motorcycle.drive()
}