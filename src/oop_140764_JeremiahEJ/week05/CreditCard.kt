package oop_140764_JeremiahEJ.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if ( usedAmount+amount <= limit) {
            usedAmount += amount
            println("Transaksi sukses, masih di bawah batas limit. Sisa limit: ${limit - usedAmount}")
        } else {
            println("Transaksi sebesar $amount ditolak. Udah kena limit bang. Limit kartu kredit: $limit.")
        }
    }
}