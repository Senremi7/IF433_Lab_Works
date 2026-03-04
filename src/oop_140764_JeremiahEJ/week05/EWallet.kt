package oop_140764_JeremiahEJ.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Transaksi sukses. \n Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("Top up sukses. \n Saldo baru: $balance")
    }
}