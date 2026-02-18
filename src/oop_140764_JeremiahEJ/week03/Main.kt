package oop_140764_JeremiahEJ.week03

fun main() {
    val e = Employee("Budawg")

    // Validation
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // encapsulation
    e.increasePerformance()
    // error because private property
    // e.performanceRating = 5

    // Computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}