package oop_124618_VilbertNusantara.week01.week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if(balance >= amount){
            balance -= amount
            println("Pembayaran $amount berhasil. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}