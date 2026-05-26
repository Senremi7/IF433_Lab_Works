package oop_140764_JeremiahEJ.week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: Pesanan Anda telah dikonfirmasi! Detail: $message")
    }
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService){
    private val file = File("orders.csv")

    fun processOrder(strategy: PricingStrategy, itemName: String, basePrice: Double, customerType: String){
        val finalPrice = strategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification("Pesanan $itemName \n Harga final: $finalPrice")
    }
}

interface PricingStrategy {
    fun calculate(basePrice: Double): Double
}

class VipPricing: PricingStrategy {
    override fun calculate(basePrice: Double) = basePrice * 0.90
}

class RegularPricing: PricingStrategy {
    override fun calculate(basePrice: Double) = basePrice
}

//
class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.9
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}