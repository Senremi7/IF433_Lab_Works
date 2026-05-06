package oop_140764_JeremiahEJ.week11

fun main (){
    println("=== TEST EXTENSION FUNCTION==")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmpty()}")

    println("\n=== TEST RUN FUCTION===")
    val result = "Kotlin".run{
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}