package week2

import java.util.Scanner


class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main (){

    val scanner = Scanner(System.`in`)


    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Damage Hero: ")
    val dmg = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, dmg)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("1. Serang")
        println("2. Kabur")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("Kamu kabur!")
            break
        }
    }

    if (hero.hp > 0 && enemyHp == 0) {
        println("Hero Menang!")
    } else if (hero.hp == 0) {
        println("Hero Kalah!")
    }
}