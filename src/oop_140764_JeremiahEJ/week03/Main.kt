package oop_140764_JeremiahEJ.week03

fun main() {
    val e = Employee("Budawg")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val w = Weapon("Axe of Peace", 600)

    println("Weapon : ${w.name}")
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")

    w.damage = -50
    println("Weapon : ${w.name}")
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")

    w.damage = 9999
    println("Weapon : ${w.name}")
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")

    val player = Player("Technoblade")

    //player.xp
    //Kotlin: Cannot access 'var xp: Int': it is private in 'oop_140764_JeremiahEJ.week03.Player'.
    player.addXp(50)
    println("Current level: ${player.level}")
    player.addXp(60)
    println("Current level: ${player.level}")
}