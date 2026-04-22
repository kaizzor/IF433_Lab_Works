package oop_124618_VilbertNusantara.week01.week9

fun main(){
    println("========== LIST OF IMUTABLLE ==========");
    val arSiswa = listOf("Budi","Danu","Susi","Cica");

    println(arSiswa);

    println("Banyak siswa : " + arSiswa.size);

    println("Siswa Bernama ${arSiswa[1]}");

    for (a in arSiswa){
        println(" Siswa "+ a + " dan ");
    }

    println("========== LIST OF MUTABLLE ==========");
    val arMatkul = mutableListOf("OOP", "Pemweb", "Matdis", "Kalkulus");
    arMatkul.add("Algo");
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("Pemweb");
    println(arMatkul);


    println("========== SET OF IMUTABLLE ==========");
    var arNilai = setOf(80,90,75,85,80,30,50,85);
    println("Banyak nilai: ${arNilai.size}");
    println("Ada angka 90 gak? ${arNilai.contains(90)}");
    println(arNilai);

    println("========== SET OF MUTABLLE ==========");
    val arMahasiswa = mutableSetOf("Andi", "Yanto", "Udin", "Yuda");
    arMahasiswa.add("Yanti");
    arMahasiswa.remove("Udin");
    arMahasiswa.add("Udin");
    println(arMahasiswa);


    println("========== MAP OF IMUTABLLE ==========");
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur Asem" to 2500
    );
    println("Banyak Menu ${arResto.size}");
    println("Harga Ayam ${arResto["Ayam"]}");
    println("List makanan: ${arResto.keys}");
    println("List Harga: ${arResto.values}");
    println(arResto);

    println("========== SET OF MUTABLLE ==========");
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Ara");
    arKHS["Nika"] = 92;
    arKHS["Cinta"]= 99;
    println(arKHS);
}