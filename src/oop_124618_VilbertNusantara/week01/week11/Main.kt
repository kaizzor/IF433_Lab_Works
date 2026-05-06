package oop_124618_VilbertNusantara.week01.week11

fun main() {

    println("=== TEST EXTENSION FUNCTIONS ===")

    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST ALSO ===")

    val numbers = mutableListOf(1, 2, 3)

    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)

    println("Setelah ditambah: $numbers")

    // APPLY + WITH
    val user = User().apply {
        name = "Alex"
        age = 25
    }

    println("\n=== TEST WITH ===")

    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }

    println("\n=== TEST COMBINE APPLY & ALSO ===")

    val users = mutableListOf<User>()

    User().apply {
        name = "Rifky"
        age = 20
    }.also {
        println("User berhasil dibuat: $it")
        users.add(it)
    }

    println(users)

    println("\n=== SMART HOME DASHBOARD ===")

    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    println(homeDevices)
}