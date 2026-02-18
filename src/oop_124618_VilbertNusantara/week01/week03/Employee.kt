package oop_124618_VilbertNusantara.week01.week03

class Employee(val name: String) {
    var salary: Int = 0;
    set(value) {
        println("Mencoba set gaji ke: $value")

        this.salary = value
    }
}