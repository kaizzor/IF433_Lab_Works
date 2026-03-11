package oop_124618_VilbertNusantara.week01.week6

interface Clickable {

    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    fun click()
}