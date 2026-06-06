package oop_124618_VilbertNusantara.week01.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

class ModernSimplePrinter : Printable {

    override fun print(doc: String) {
        println("Printing securely: $doc")
    }
}
