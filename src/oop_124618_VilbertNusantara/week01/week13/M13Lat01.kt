package oop_124618_VilbertNusantara.week01.week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(){
    println("\n === Cara1 - Baca isi file === ")
    val file1 = File ("src/oop_124618_VilbertNusantara/week01/week13/contohfile.txt");
    val isiContent = file1.readText();
    println(isiContent);

    println("\n === Cara2 - Baca isi file === ")
    val contentSaya = file1.readLines();
    contentSaya.forEach{
        println(it)
    }

    println("\n === Cara3 - Baca isi file - BUFFERED READER === ")
    val file2 = BufferedReader(FileReader("src/oop_124618_VilbertNusantara/week01/week13/contohfile.txt"));
    var isiFile: String? = file2.readLine();
    while(isiFile != null){
        println(isiFile);
        isiFile = file2.readLine();
    }
    file2.close();

    println("\n === Cara4 - Baca isi file - BUFFERED READER (Ver.USE) === ");
    val file3 = File("src/oop_124618_VilbertNusantara/week01/week13/contohfile.txt").bufferedReader();
    file3.use {
        it.lineSequence()
            .filter { it.isNotBlank() }
            .forEach { println(it) }
    }
}









