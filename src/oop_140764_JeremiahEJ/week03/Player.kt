package oop_140764_JeremiahEJ.week03

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = xp / 100 + 1

    fun addXp(amount: Int){
        if (amount < 0){
            println("ERROR: XP tidak boleh negatif! Tidak ada perubahan.")
        } else {
            val curr = level
            xp += amount
            if (curr < level){
                println("Level Up! Selamat $username naik ke level $level!")
            }
        }
    }


}