package week2

class Student(
    val name: String,
    val nim: String,
    var major: String
)
{
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}