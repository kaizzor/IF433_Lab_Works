package oop_124618_VilbertNusantara.week01.week6

interface Organisasi {
    val namaOrg: String;
    val budgetRapat: Int;
    val jmlOrg: Int;
    val biayaKonsuumsi: Int
        get() = budgetRapat * jmlOrg;

    fun rapat();
    fun keaktifan(){
        println("Ih kamu aktif");
    }
}