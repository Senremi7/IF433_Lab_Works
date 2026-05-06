package oop_140764_JeremiahEJ.week11

data class SmartDevice(
    var name: String,
    var category:String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String{
    return "[DIAGNOSTIK] $name |" +
            " Kategori:\n" +
            "category | Status: ${if (isOnline) "Online" else "Offline"} |\n" +
            "Daya: $powerLoad Watt"
}