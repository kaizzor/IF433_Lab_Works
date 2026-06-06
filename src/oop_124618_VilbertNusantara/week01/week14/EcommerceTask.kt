package oop_124618_VilbertNusantara.week01.week14

import java.io.File

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(
        customerName: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when(customerType) {
            "VIP" -> basePrice * 0.90
            "REGULAR" -> basePrice
            else -> basePrice
        }

        println("Memproses pesanan $customerName seharga $finalPrice")

        file.appendText("$customerName,$finalPrice\n")

        println("Email terkirim! Pesanan Anda telah dikonfirmasi")
    }
}