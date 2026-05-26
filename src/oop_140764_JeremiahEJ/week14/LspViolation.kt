package oop_140764_JeremiahEJ.week14

open class Rectangle{
    open val width: Int = 0
    open val height: Int = 0
    fun area() = width * height
}

class Square: Rectangle(){
    override var width: Int = 0
        set(value) { field = value ; super.height = value }
    override var height: Int = 0
        set(value) { field = value ; super.width = value }
}