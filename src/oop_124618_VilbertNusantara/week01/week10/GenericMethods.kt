package oop_124618_VilbertNusantara.week01.week10

fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

fun <T> processData(input: T): T {
    return input
}

fun <T> findMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}