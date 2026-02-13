package oop_140764_JeremiahEJ.week02

class Hero (
    val name: String,
    val int: Int,
    var hp: Int = 100
){
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage

        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}