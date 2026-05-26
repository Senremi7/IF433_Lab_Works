package oop_140764_JeremiahEJ.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord?{
    val parts = line.split(",")
    try{
        return TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble())
    } catch (e: Exception){
        println("(Log) Data korup diabaikan: $line")
        return null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String){
    File(path).printWriter().use{ out ->
        trades.forEach {out.println(it.toCsv())}
    }
}

fun loadTrades(path: String): List<TradeRecord>{
    return try {
        File(path).readLines().mapNotNull {
            fromCsvTrade(it)
        }
    } catch (e: FileNotFoundException){
        return emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 1945.0, 45.0),
        TradeRecord(2, "ETHUSDT", "SHORT", 17800.0, -10.0),
        TradeRecord(3, "BNBUSDT", "LONG", 350.0, 15.0)
    )
    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
}