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

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }

    val acDevice = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(acDevice)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {
        println("\n=== SMART HOME SUMMARY ===")
        println("Jumlah perangkat: ${this.size}")
    }
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("Total penggunaan daya: $totalPower Watt")
}