package oop_124618_VilbertNusantara.week01.week4

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}