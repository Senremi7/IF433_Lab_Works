package oop_140764_JeremiahEJ.week03

class Weapon(
    val name: String,
    damage: Int
){
    var damage: Int = damage
        set(value) {
            if (value < 0){
                println("ERROR: Damage tidak boleh negatif! Value masih sama")
                field = value
            } else if (value > 1000) {
                println("Damage terlalu overpowered woi! Capped at 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            if (damage > 800){
                return "Legendary"
            } else if (damage > 500){
                return "Epic"
            } else {
                return "Common"
            }
        }
}