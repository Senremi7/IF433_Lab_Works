package oop_140764_JeremiahEJ.week01

fun main() {
    val gameTitle: String = "R.E.P.O"
    val price: Int = 84500
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500000)
        (price * 0.8).toInt()
    else
        (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Title: $title")
    println("Final Price: Rp. $finalPrice")
    println("Note: ${note ?:"Tidak ada catatan"}")
}