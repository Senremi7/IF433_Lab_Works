package oop_140764_JeremiahEJ.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid bang: ID hilang dari lane"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid juga bang: ga ada nama"
        }

        val type = rawJson["type"] as? String
        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                return Product.Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                return Product.Clothing(id, name, size)
            }

            else -> null
        }
    }

    fun checkout(product: Product){
        val id: String = when (product){
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        val hasil = JavaPaymentService.processPayment(id)!!
        println("Hasil: $hasil")
    }
}