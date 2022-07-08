package object_oriented

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    override fun toString(): String {
        return "Book[title=$title]"
    }
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main() {

    val book = Book("Super Book", "John Doe", 2017, 99.99)
    val book2 = Book("Super Book", "John Doe", 2017, 99.99)
    val dataBook = DataBook("Super Data Book", "John Doe", 2017, 99.99)
    val dataBook2 = DataBook("Super Data Book", "John Doe", 2017, 99.99)

    val dataBook3 = dataBook.copy(price = 89.99)

    println(book) // needs an explicit implementation of the toString method to print right
    println(dataBook)
    println(dataBook3)

    println(book.equals(book2)) // prints false since the object instance isn't the same
    println(dataBook.equals(dataBook2)) // prints true since it's a data class and the 'equals' method is implicitly 'overridden' to compare each of the properties
    println(dataBook == dataBook2) // prints true because it works just like the example above
    println(dataBook == dataBook3) // prints false because price property does not have the same value as dataBook#price

    val (title, author, publicationYear, price) = dataBook

    println("$title - $author - $publicationYear - $price")

    val hash = hashSetOf(dataBook, dataBook2, dataBook3)

    println(hash) // prints only the two different data books
}