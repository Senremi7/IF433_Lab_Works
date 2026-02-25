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

    println("\n--- Test Employee ---")
    val employee = Employee("Mahamatra Seno", 7500000)
    employee.work()
    println("Bonus: ${employee.calculateBonus()}")

    println("\n--- Test Manager ---")
    val manager = Manager("Rukiaz", 15000000, "ABCDEFG IT")
    manager.work()
    println("Bonus: ${manager.calculateBonus()}")
}