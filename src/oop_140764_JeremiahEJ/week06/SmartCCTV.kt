package oop_140764_JeremiahEJ.week06

class SmartCCTV(
    override val id: String,
    override val name: String
): SmartDevice, Switchable, Recordable {
    override fun turnOff(){
        println("CCTV '$name' dengan id '$id' mati.")
    }
    override fun startRecord() {
        println("CCTV '$name' dengan id '$id' mulai merekam.")
    }
    override fun turnOn(){
        println("CCTV '$name' dengan id '$id' nyala.")
        startRecord()
    }
}