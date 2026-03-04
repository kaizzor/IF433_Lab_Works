package oop_124618_VilbertNusantara.week01.week5

class Elective:MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama="VR Progaming";
        println("Elective ${super.nama} sks $sks ")
    }
    fun ada_praktek(){
        println("Wajib di praktekin");
    }
}