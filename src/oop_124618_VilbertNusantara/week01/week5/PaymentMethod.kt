package oop_124618_VilbertNusantara.week01.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}