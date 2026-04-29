package oop_140764_JeremiahEJ.week10

fun main() {
    println("=== CRYPTO DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 3700.0))
    coinRepo.add(Coin("USDT", 1200.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach { println("Coin: ${it.name} \nBalace: ${it.balance}") }

    println("\n=== TRANSACTIONS ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("A1", 1.0))
    txRepo.add(Transaction("A2", 0.5))
    txRepo.add(Transaction("A3", 2.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    txResponse.data.forEach { println("Transaction: ${it.id} \nAmount: ${it.amount}") }
}