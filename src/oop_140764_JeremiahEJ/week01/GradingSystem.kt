#!/usr/bin/env kotlin

package oop_140764_JeremiahEJ.week01

fun main() {
    var name: String = "John Thor"
    var score: Int = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90 <= .. <= 100 -> "A"
        in 80 <= .. <= 89 -> "B"
        in 70 <= .. <= 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    fun calculateScore(score: Int) = if (score <75) "Lulus" else "Tidak Lulus"
    println("Status: ${calculateScore(score)}")
}