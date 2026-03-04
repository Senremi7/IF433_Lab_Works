package oop_140764_JeremiahEJ.week05

class Dosen(nama: String, val nidn: String) : Pengawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan daan merivisi RPKPS.")
    }

    fun mengjar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}