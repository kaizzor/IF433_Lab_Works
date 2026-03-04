package oop_124618_VilbertNusantara.week01.week5

fun main() {

    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // polymorphic collection
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        // runtime polymorphism
        pegawai.bekerja()

        // smart casting
        when (pegawai) {

            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("-------------------")

        val math = MathHelper()

        println("=== TEST MATH HELPER ===")
        println("Luas Persegi: ${math.hitungLuas(5)}")
        println("Luas Persegi Panjang: ${math.hitungLuas(6,4)}")
        println("Luas Lingkaran: ${math.hitungLuas(7.0)}")
    }
}