package oop_124618_VilbertNusantara.week01.week7

class Mahasiswa private constructor(val kampus:String) {
    companion object{
        var nama:String ="UNKNOW";

        fun set_nilai(uts: Int, uas: Int): Int{
            return (uts+uas)/2;
        }
        fun isi_nama_kampus(namaUniv:String){
            Mahasiswa(kampus = namaUniv);
        }
    }
    //bagian yang class biasa (Bukan caompanion Objact)
    init {
        println("Nama kampus kamu $kampus");
    }
}