package oop_124618_VilbertNusantara.week01.week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if(usedAmount + amount <= limit){
            usedAmount += amount
            println("Pembayaran $amount berhasil menggunakan Credit Card.")
        } else {
            println("Transaksi ditolak, melebihi limit.")
        }
    }
}