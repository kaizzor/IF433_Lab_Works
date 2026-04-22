package oop_124618_VilbertNusantara.week01.week9

fun main() {
    println("=== TEST LIST ===")

    // Immutable List
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    // Mutable List
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}