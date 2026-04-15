package oop_140764_JeremiahEJ.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "CO1", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // mising id
        mapOf("id" to "XO2", "name" to "Unknown", "type" to "FOOD") // unkown type
    )

    val parser = ApiParser()
    for (rawData in rawApiData) {
        try {
            val product = parser.parseProduct(rawData)
            product?.let {
                println("Parsed: $it")
                parser.checkout(it)
            } ?: println("Parsing gagal: Tipe produk tidak dikenali.")
        } catch (e: IllegalArgumentException) {
            println("Error msg: ${e.message}")
        }
    }
}