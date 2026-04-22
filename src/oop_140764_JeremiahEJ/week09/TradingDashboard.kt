package oop_140764_JeremiahEJ.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("XAUUSD", "LONG", 10, 15.5, "OPEN"),
        TradeLog("EURUSD", "SHORT", 5, -8.2, "CLOSED"),
        TradeLog("BTCUSD", "LONG", 20, 25.0, "OPEN"),
        TradeLog("USDJPY", "SHORT", 15, -12.3, "CLOSED"),
        TradeLog("BBCA", "LONG", 3, 3.2, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 13, 15.0, "CLOSED"),
        TradeLog("XAGUSD", "SHORT", 8, 5.0, "CLOSED")
    )

    println("All Closed Trades:")
    val closedTrades = tradeHistory.filter { it.Status == "CLOSED" }
    for (trade in closedTrades) {
        println("Pair: ${trade.pair}\n" +
                "Position: ${trade.position}\n" +
                "Leverage: ${trade.leverage}\n" +
                "ROE: ${trade.roe}")
        println()
        // Biar rapih & hasil, gabut
    }
    println("------------------------------")

    println("\nAll Closed Profit Trades:")
    val winningTrades = closedTrades.filter { it.roe > 0 }
    for (trade in winningTrades) {
        println("Pair: ${trade.pair}\n" +
                "Position: ${trade.position}\n" +
                "Leverage: ${trade.leverage}\n" +
                "ROE: ${trade.roe}")
        println()
    }
    println("------------------------------")

    println("\nAll Closed Loss Trades:")
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    for (trade in losingTrades) {
        println("Pair: ${trade.pair}\n" +
                "Position: ${trade.position}\n" +
                "Leverage: ${trade.leverage}\n" +
                "ROE: ${trade.roe}")
        println()
    }
    println("------------------------------")

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("Top Performing Closed Trades:")
    for (trade in topPerformersString) {
        println(trade)
    }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("Worst Performing Closed Trades:")
    for (trade in worstPerformersString) {
        println(trade)
    }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    println("Unique Trading Pairs:")
    for (pair in uniquePairs) {
        println(pair)
    }

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("Top Performers: ")
    topPerformersString.forEach { println(it) }
}
