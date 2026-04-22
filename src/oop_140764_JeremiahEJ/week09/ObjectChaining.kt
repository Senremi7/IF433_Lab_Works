package oop_140764_JeremiahEJ.week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("Cid TJO", 3.2),
        Student("Randy", 3.9),
        Student("Sandy", 2.8),
        Student("Alocard", 3.7)
    )
}