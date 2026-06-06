package oop_124618_VilbertNusantara.week01.week14

data class User(val name: String, val email: String, val age: Int)

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