package oop_124618_VilbertNusantara.week01.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {

    override fun query(sql: String): List<String> {
        return listOf("pg_data1", "pg_data2")
    }
}