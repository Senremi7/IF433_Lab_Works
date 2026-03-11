package oop_140764_JeremiahEJ.week06

class SmartLamp(
    override val id: String,
    override val name: String
): SmartDevice, Switchable {
    override fun turnOn(){
        println("Lampu '$name' dengan id '$id' menyala.")
    }
    override fun turnOff(){
        println("Lampu '$name' dengan id '$id' mati.")
    }
}