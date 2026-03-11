package oop_140764_JeremiahEJ.week06

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
    fun activateSecurityMode(){
        for (device in devices) {
            if (device is Recordable){
                device.startRecord()
            } else if (device is SmartSpeaker){
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}