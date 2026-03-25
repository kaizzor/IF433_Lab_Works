package oop_124618_VilbertNusantara.week01.week7

fun main(){
    println("server: ${Koneksi.linkServer}");
    Koneksi.test_koneksi();

    Mahasiswa.nama="Udin";
    val na = Mahasiswa.set_nilai(80,100);
    println("Nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus("UMN");

    val dsn1 = Dosen(nama="Indah",nik="12345", tahunMasuk=2020);
    println(dsn1);
    val dsn2 =dsn1.copy(nama="Budi",nik="3254");
    println(dsn2);
    //cara ambil data satu field aja
    println("Nama Dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

    println("Matkul Fav saya "+ MataKuliah.OOP.name);
    println("Index matkul: "+MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul();

    //looping muncul semua
    for (matkul in MataKuliah.entries){
        print("matkul: "+ matkul);
        matkul.sks_matkul();
    }
}