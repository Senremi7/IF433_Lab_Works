package oop_140764_JeremiahEJ.week06

class Button(override val name: String) : Clickable{
    override fun click() {
        println("Tombol '$name' berhasil diklick!")
    }
}