package oop_140764_JeremiahEJ.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Kapal Terbang Senremi")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar("Furina", 3, 500)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}