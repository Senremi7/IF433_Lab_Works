package oop_140764_JeremiahEJ.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner( System.`in` )

    println("=== Aplikasi Jeremiahhh ===")
    println("1. PMB UMN")
    println("2. Library Fine System")
    println("3. Exit")

    val choice = scanner.nextInt()
    scanner.nextLine()

    when (choice) {
        1 -> {
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

                val s1 = Student(name, nim, major)
                println("Status: Pendaftaran Selesai.")

                print("Pilih Jalur (1. Reguler, 2. Umum): ")
                val type = scanner.nextInt()
                scanner.nextLine()

                if (type == 1) {
                    val s1 = Student(name, nim, major)
                    println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
                } else if (type == 2) {
                    val s2 = Student(name, nim)
                    println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
                } else {
                    println("Pilihan nguawurrrrr, pendaftaran batal!")
                }
            }
        }
        2 -> {
            println("--- Library Fine System ---")

            print("Judul Buku: ")
            val title =  scanner.nextLine()

            print("Nama Peminjam: ")
            val peminjam = scanner.nextLine()

            print("Lama Pinjam (Hari): ")
            var durasi = scanner.nextInt()
            scanner.nextLine()

            if (durasi < 0) {
                durasi = 1
            }

            val denda = Loan(title, peminjam, durasi)

            println("Detail Peminjaman")
            println("Buku       :${denda.bookTitle}")
            println("Peminjam   :${denda.borrower}")
            println("Lama Pinjam:${denda.loanDuration} hari")
            println("Total Denda: Rp${denda.calculateFine()}")
        }
        3 ->{
            println("Test")
        }
        else -> {
            println("Menu tidak valid")
        }
    }

}