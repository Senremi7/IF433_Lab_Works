package oop_140764_JeremiahEJ.week05

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Aplikasi Jeremiah ===")
    println("1. Aktivitas Pengawai")
    println("2. MathHelper")
    println("3. Credit Card System")
    println("0. Exit")
    print("Pilihan: ")
    val choice = scanner.nextInt()
    scanner.nextLine()

    when (choice) {
        1 -> {
            val dosen1 = Dosen("Pak Indru", "56788")
            val admin1 = Admin("Bu Kiana")

            val daftarPengawai: List<Pengawai> = listOf(dosen1, admin1)

            println("=== AKTIVITAS PENGAWAI ===")
            for (pengawai in daftarPengawai) {
                pengawai.bekerja()

                when (pengawai) {
                    is Dosen -> {
                        println("=> Terdeteksi sebagai Dosen (NIDN: ${pengawai.nidn})")
                        pengawai.mengjar()
                    }

                    is Admin -> {
                        println("=> Terdeteksi sebagai Admin")
                        pengawai.doAdminWork()
                    }
                }
                println("-----------------------------")
            }
        }

        2 -> {
            println("=== MathHelper ===")
            val math = MathHelper()
            println("Luas Persegi sisi 5: ${math.hitungLuas(5)}")
            println("Luas Persegi Panjang panjang 4 dan lebar 2: ${math.hitungLuas(4, 2)}")
            println("Luas Lingkaran jari-jari 3: ${math.hitungLuas(7.0)}")
        }

        3 -> {
            println("=== Credit Card System ===")
            val ewallet = EWallet("Jeremiah", 50000.0)
            val credit = CreditCard("Senora", 100000.0)

            val method: List<PaymentMethod> = listOf(ewallet, credit)

            for (payment in method) {
                //payment.processPayment(75000.0)

                if (payment is EWallet) {
                    payment.topUp(50000.0)
                }
                payment.processPayment(75000.0)
            }
        }
    }
}