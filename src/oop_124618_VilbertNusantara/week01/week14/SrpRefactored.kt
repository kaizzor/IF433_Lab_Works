package oop_124618_VilbertNusantara.week01.week14

class UserValidator {
    fun validate(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }
}

class UserRepository {
    fun save(user: User) {
        println("Saving user ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}