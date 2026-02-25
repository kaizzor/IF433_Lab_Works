package oop_124618_VilbertNusantara.week01.week4

open class Vehicle {
    var speed: Int = 0

    open fun accelerate(val brand: String) {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}
