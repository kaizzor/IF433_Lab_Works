package oop_124618_VilbertNusantara.week01.week6

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name menyala.")
    }
    override fun turnOff() {
        println("Speaker $name dimatikan.")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}