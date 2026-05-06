package oop_140764_JeremiahEJ.week11

data class SmartDevice(
    var name: String,
    var category:String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)