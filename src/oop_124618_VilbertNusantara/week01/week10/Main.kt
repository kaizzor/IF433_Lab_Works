package oop_124618_VilbertNusantara.week01.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")

    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}