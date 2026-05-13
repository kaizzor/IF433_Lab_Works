package oop_124618_VilbertNusantara.week01.week12

fun main() {

    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {

        "42X".toInt()
    }
}