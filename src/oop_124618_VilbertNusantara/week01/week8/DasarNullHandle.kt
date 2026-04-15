package oop_124618_VilbertNusantara.week01.week8

class set_krs(val nim:String?, val kodematkul: String?){
    fun matkul_wajib(sks: Int?){
        println("Matkul kamu adalah $kodematkul sks-nya adalah $sks");
    }
}

fun main(){
    var nama:String? = "Vilbert";
    nama = null;
    println("Hai $nama");

    val settingKRS = set_krs(nim= "123", kodematkul = null);
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(null);
}