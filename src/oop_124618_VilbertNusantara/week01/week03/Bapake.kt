package oop_124618_VilbertNusantara.week01.week03

open class Bapake {
    private var nama: String ="Belum Tau";
    private var umur: Int = 35;
    protected var gaji: Int = 10000;

    public var uangjajan: Int = 0
        set(value){
            if(value<0){
                println("Masa uang jajan 0 atau minus");
            }else{
                field = value;
            }
        }
        get(){
            return field+123;
        }

    public fun set_nama(namabaru: String) {
        if(this.nama.length <=0){
            println("Eh nama ga boleh kosong");
        }else{
            this.nama= namabaru;
        }
    }
    public fun get_nama(): String {
        return this.nama;
    }
    fun set_umur(umurbaru: Int) {
        if (umurbaru <= 0) {
            println("Eh umur ga boleh minus")
        } else {
            this.umur = umurbaru
        }
    }
    fun get_umur(): Int {
        return this.umur
    }
}

class Anake: Bapake() {
    fun dapetin_gaji_bapak(): Int{
        this.gaji = 5500
        return this.gaji + 200;

    }
}

fun main(){
    var bpk = Bapake();
    bpk.set_nama("Yanto");
    bpk.set_umur(40);
    println("Nama Papi Kamu ${bpk.get_nama()}");
    println("Umur Papi Kamu ${bpk.get_umur()}");

    var ank= Anake();
    println("Gaji bapak: ${ank.dapetin_gaji_bapak()}");

    ank.uangjajan = -100;

}