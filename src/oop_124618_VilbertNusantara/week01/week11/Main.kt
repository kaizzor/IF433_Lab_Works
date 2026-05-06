package oop_124618_VilbertNusantara.week01.week11

fun main() {

    println("=== TEST EXTENSION FUNCTIONS ===")

    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST ALSO ===")

    val numbers = mutableListOf(1, 2, 3)

    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)

    println("Setelah ditambah: $numbers")

    // OBJECT USER UNTUK WITH
    val user = User().apply {
        name = "Alex"
        age = 25
    }

    println("\n=== TEST WITH ===")

    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }
}