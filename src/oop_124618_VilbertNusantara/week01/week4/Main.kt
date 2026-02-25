package oop_124618_VilbertNusantara.week01.week4

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val tesla = ElectricCar("Tesla", 4, 90)
    tesla.openTrunk()
    tesla.honk()
    tesla.accelerate()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    val developer = Developer("Rifky", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}