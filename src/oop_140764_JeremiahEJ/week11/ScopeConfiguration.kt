package oop_140764_JeremiahEJ.week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = User().apply{
        name = "Jeremiah"
        age = 20
    }
    println(user)
}