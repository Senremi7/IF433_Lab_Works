package oop_140764_JeremiahEJ.week04

class Manager(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimppin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }

}