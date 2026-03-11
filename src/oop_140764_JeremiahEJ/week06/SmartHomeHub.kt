package oop_140764_JeremiahEJ.week06

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}