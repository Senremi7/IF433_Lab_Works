package oop_140764_JeremiahEJ.week05

fun main(){
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

    println("=== MathHelper ===")
    val math = MathHelper()
    println("Luas Persegi sisi 5: ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang panjang 4 dan lebar 2: ${math.hitungLuas(4, 2)}")
    println("Luas Lingkaran jari-jari 3: ${math.hitungLuas(7.0)}")
}