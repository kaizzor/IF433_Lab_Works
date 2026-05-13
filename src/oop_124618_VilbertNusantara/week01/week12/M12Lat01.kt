package oop_124618_VilbertNusantara.week01.week12

//Basic Exception - TryCatch
fun pembagian(pembilang: Int, penyebut: Int){
    try {
        val hasilBagi = pembilang/penyebut;
        println("Hasil bagi :$hasilBagi");
    }catch(e:Exception){
        println("Error diPembagian: ${e.message}");
    }finally{
        println("Selesai Pembagian");
    }
}

//Exception - Expression - Tipe data
fun cek_tipe_data(){
    var angka: Int = try{
        Integer.parseInt("10");
    }catch (e: Exception){
        println("ada Err di CekTipeData ${e.message}");
        23797
    }
    println("Angka kamu adalah ${angka}");
}

//Throw
fun cek_saldo(saldoSaya: Int){
    if(saldoSaya < 1000){
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    }else{
        println("Selamat kamu orang kaya")
    }
}

//Custom Exception
class cekNilaiKKM(val kkm: Int,val nilai: Int): Exception("Nilai ${nilai} berada dibawah ${kkm}")

class nilai_siswa(val kkm: Int){
    fun input_nilai(nilaiKamu: Int){
        if(nilaiKamu < kkm){
            throw cekNilaiKKM(kkm, nilaiKamu);
        }else{
            println("Kamu Lulus, dengan Nilai ${nilaiKamu}");
        }
    }
}

fun main(){
    //panggil class custom Exception
    val nsiswa = nilai_siswa(70);
    try {
        nsiswa.input_nilai(60);
    }catch(e:Exception){
        println("Ada error saat input nilai ${e.message}");
    }

    //Coba Throw
    try {
        cek_saldo(900);
    }catch(e:Exception){
        println("Error diThrow: ${e.message}");
    }
    //Exception - Expression
    cek_tipe_data()

    //Basic Exception
    pembagian(10,0);
}