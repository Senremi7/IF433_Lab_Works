package oop_140764_JeremiahEJ.week13

import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")

    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")
// Bahaya: Jika terjadi exception sebelum writer.close(), resource tidak akan tertutup dengan benar

    //Harus dipanggil secara manual, dan jika terjadi error, bisa menyebabkan resource leak
    writer.close()
    println("Proses penulisan unsafe selesai.")
}