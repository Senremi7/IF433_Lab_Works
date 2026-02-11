package oop_140764_JeremiahEJ.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner( source = System.`in` )

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter.")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val sl = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}