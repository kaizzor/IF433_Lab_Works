package oop_124618_VilbertNusantara.week01.week4

open class Makanan {
    private var namaResto: String = "";
    protected var harga: Int = 0;
    protected var stock: Int = 10;

    init{
        namaResto = "Steak 12";
        println("Resto Saya $namaResto")
    }

    open public fun jual_makanan(){
        println("Saya jual makanan");
    }
}