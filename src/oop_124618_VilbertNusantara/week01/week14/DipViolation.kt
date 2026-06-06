package oop_124618_VilbertNusantara.week01.week14

class MySQLDatabase {
    fun query(sql: String): List<String> {
        return listOf("data1", "data2")
    }
}

class UserService {

    private val database = MySQLDatabase()

    fun getUser(id: Int) {
        database.query("SELECT * FROM users WHERE id=$id")
    }
}