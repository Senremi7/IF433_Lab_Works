package oop_140764_JeremiahEJ.week04

open class Vehicle(val brand: String){
    var speed: Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("Beep! Beep!")
    }
}