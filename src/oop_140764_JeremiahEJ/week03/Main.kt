package oop_140764_JeremiahEJ.week03

fun main() {
    val e = Employee("Budawg")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val w = Weapon("Excalibur", 600)

    w.damage = -50
    w.damage = 9999

    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")
}