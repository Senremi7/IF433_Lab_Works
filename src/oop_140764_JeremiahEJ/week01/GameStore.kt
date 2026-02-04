package oop_140764_JeremiahEJ.week01

class GameStore {
    val gameTitle: String = "R.E.P.O"
    val price: Int = 84500
}

fun calculateDiscount(price: Int) =
    if (price > 500000)
        (price * 0.8).toInt()
    else
        (price * 0.9).toInt()