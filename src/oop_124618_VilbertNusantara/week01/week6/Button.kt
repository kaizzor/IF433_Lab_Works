package oop_124618_VilbertNusantara.week01.week6

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol $name berhasil diklik!");
    }
}