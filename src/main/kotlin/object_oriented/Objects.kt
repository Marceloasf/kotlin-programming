package object_oriented

// A kind of 'class' that can have only one instance (like a static object), and they are global - Singleton
object Cache {
    val name = "HyperCache"

    fun retrieveData(): Int {
        return 0
    }
}