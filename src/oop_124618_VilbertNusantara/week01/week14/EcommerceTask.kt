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

interface OrderRepository {
    fun saveOrder(customerName: String, price: Double)
}

class CsvOrderRepository : OrderRepository {

    private val file = File("orders.csv")

    override fun saveOrder(customerName: String, price: Double) {

        file.bufferedWriter().use {
            it.write("$customerName,$price\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("EMAIL: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(customerName: String, finalPrice: Double) {

        repo.saveOrder(customerName, finalPrice)

        notifier.sendNotification(
            "Pesanan $customerName berhasil diproses"
        )
    }
}