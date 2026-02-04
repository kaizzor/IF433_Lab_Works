package oop_124618_VilbertNusantara.week01

fun main(){
    var name: String ="Jhon Thor"
    val score: Int = 80

    println("Nama: $name, Nilai $score ")

    val grade = when (score) {
        in 90.. 100->"A"
        in 80.. 89->"B"
        in 70.. 79->"C"
        else->"D"
    }
    println("Grade Kamu: $grade")
}