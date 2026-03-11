package oop_124618_VilbertNusantara.week01.week6

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}