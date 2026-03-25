package oop_124618_VilbertNusantara.week01.week7

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // false

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}") // true

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (name, age) = data1
    println("Destructured: $name berumur $age")
    println("\n=== TEST DATA CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Data: ${response.data}"
        is ApiResponse.Error -> "Error: ${response.message}"
    }
}