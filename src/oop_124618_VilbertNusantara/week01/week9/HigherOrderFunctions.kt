package oop_124618_VilbertNusantara.week01.week9

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8)

    println("Original Data: $numbers")

    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp $it k" }

    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    val sorted = multiplied.sortedByDescending { it }
    sorted.forEach { println(it) }
}