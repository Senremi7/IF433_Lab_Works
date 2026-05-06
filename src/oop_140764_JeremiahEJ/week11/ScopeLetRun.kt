package oop_140764_JeremiahEJ.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Jeremiah"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}