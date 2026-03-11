package oop_124618_VilbertNusantara.week01.week6

fun main() {
    val mhs = Mahasiswa(
        namaOrg = "HMIF",
        budgetRapat = 15000,
        jmlOrg = 20,
        namaMk = "OOP",
        nilaiMk = 89);
    mhs.rapat();
    mhs.penilaian();
    mhs.keaktifan();
}