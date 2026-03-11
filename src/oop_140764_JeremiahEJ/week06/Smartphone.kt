package oop_140764_JeremiahEJ.week06

class Smartphone: Camera, Phone{
    override fun turnOn(){
        super<Phone>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}