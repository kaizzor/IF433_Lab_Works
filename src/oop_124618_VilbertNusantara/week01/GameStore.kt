package oop_124618_VilbertNusantara.week01

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(
    title: String,
    finalPrice: Int,
    userNote: String?
) {

    val note = userNote ?: "Tidak ada catatan"

    println("===== STRUK PEMBELIAN =====")
    println("Judul Game : $title")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan    : $note")
}

fun main() {

    val gameTitle = "Cyber Adventure"
    val price = 650000

    val finalPrice = calculateDiscount(price)

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}
