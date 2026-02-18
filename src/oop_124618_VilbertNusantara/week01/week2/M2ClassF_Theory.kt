package oop_124618_VilbertNusantara.week01.week2

class Pemain{
    var nama: String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot: Int = 8;

    init{
        nama= "Messi";
        println("Ini adalah Constructor");
    }

    constructor(alias:String="Budi", kecepatan: Int=2){
        nama = alias;
        speed = kecepatan;
        println("Ini adalah Constructor kedua");
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola");
    }
}

fun main(){
    val player = Pemain(alias="Yoel",kecepatan=100);
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill kecepatan: " + player.speed);

    val player2= Pemain(alias="Ronaldo",kecepatan=99);
    println("Pemain Populer: ${player2.nama}");
    println("Kecepatan: ${player2.speed}");
}
