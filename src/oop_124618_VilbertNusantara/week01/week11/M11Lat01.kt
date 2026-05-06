package oop_124618_VilbertNusantara.week01.week11

import oop_124618_VilbertNusantara.week01.week8.Mahasiswa

// function biasa
fun panggil_nama(nama:String):String{
    return "Hai $nama"
}

// extension function - BASIC
fun String.panggil_mahasiswa(): String {

    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c ->
            c.uppercase()
        }
    }
    return hasil
}

//function extention - parameter
fun Int.tentukanLulus(nama:String):String{
    var keputusan = "";
    if (this >= 70){
        keputusan = "Lulus";
    }else{
        keputusan = "Remedial";
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan";
}

//function Extention - Null
fun String?.cekNulldanEmpty():String{
    if(this == null || this.isEmpty()){
        return "gak boleh kosong bang"
    }else {
        return "Username kamu adalah $this"
    }
}

class Mahasiswa(){
    var nim:String = "";
    var nama:String = "";
    var ipk: Int = 0;
}

fun main(){
    //cara panggil function Extention - Null
    var inputUsername:String? = null
    println(inputUsername.cekNulldanEmpty());

    //cara panggil function extention - Parameter
    println(80.tentukanLulus("Revan"));
    // cara panggil function biasa
    println(panggil_nama("Toni").uppercase());

    // cara panggil extension function
    println("tonyyy stark iron man".panggil_mahasiswa());

    //SCOPE - LET
    var kampusSaya = "UMN";
    kampusSaya.let {
        if (it == "UMN") {
            println("kampus " + it + "Keren");
        }else{
            println("Amazing $it");
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong";
    alamatSaya.run{
        println("Saya tinggal di " + this);
    }

    //SCOPE - WITH
    var gradeSaya = with(receiver = 90){
        if(this >= 80){
            "A"
        }else if(this >= 70){
            "B"
        }else{
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya");

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply{
        nama = "Yudi";
        nim = "12345"
        ipk = 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan Nim ${dataMahasiswa.nim} IPK nya ${dataMahasiswa.ipk}");

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68,85);
    deretAngka.also{
        println("Sebelum $deretAngka");
    }.add(90)
    println("Setelah $deretAngka");
}