package oop_140764_JeremiahEJ.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 3700.0))
    coinRepo.add(Coin("USDT", 1200.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach { println("Coin: ${it.name} \nBalace: ${it.balance}") }
}