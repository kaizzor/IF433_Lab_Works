package oop_124618_VilbertNusantara.week01

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100 else price * 90 / 100

fun main() {

    val gameTitle = "Cyber Adventure"
    val price = 650000

    val finalPrice = calculateDiscount(price)
}

