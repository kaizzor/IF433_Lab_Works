package oop_124618_VilbertNusantara.week01.week5

class Wajib: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama="OOP";
        println("Matkul ${super.nama} sks $sks ")
    }
    fun ada_seminar(){
        println("Wajib ada seminar");
    }
}