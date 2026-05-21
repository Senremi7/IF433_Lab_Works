package oop_140764_JeremiahEJ.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(
    val name: String,
    val age: Int,
    val gpa: Double
)

//serialization
fun Student.toCsv(): String = "$name,$age,$gpa"

//deserialization
fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}