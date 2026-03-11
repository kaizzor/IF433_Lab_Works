package oop_124618_VilbertNusantara.week01.week6

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMk: String,
    override val nilaiMk: Int
) : Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang rapat di $namaOrg")
        println("Biaya Konsumsi Rapat: ${super.biayaKonsuumsi}")
    }
    override fun keaktifan() {
        super<KelasMK>.keaktifan();
        super<Organisasi>.keaktifan();
    }

    override fun penilaian() {
        println("Nilai $namaMk adalah $nilaiMk")
    }
}