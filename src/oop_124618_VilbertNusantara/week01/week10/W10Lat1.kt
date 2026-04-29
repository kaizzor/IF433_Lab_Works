package oop_124618_VilbertNusantara.week01.week10

//code Non-Generic
class rumah(val alamat: Any);

//code Generic
class kampus<T>(val alamat:T);

//code Generic - Multi Parameter
class Komputer<T, V>(val merek:T,val barcode:V );

//code Generic - Function
fun<T> Password(isiPass:T):T {
    return isiPass;
}

fun main(){
    println("==== GENERIC - FUNCTION ====");
    println("Password kamu: " + Password(isiPass = "12345"));

    println("==== GENERIC - MULTI PARAM ====");
    val komp = Komputer("dell", barcode = 12345);
    println("Merek Komputer : "+ komp.merek);
    println("Barcode Komputer :  ${komp.barcode}");



    println("==== SAMPLE NON-GENERIC ====");
    val rmh = rumah(alamat = 200);
    val angkaRumah = rmh.alamat as Int;
    println(angkaRumah + 50);


    println("==== SAMPLE GENERIC ====");
    val kmps = kampus(alamat = 300);
    println(kmps.alamat + 50);
}