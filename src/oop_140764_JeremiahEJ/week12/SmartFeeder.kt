package oop_140764_JeremiahEJ.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {
    require(requestedGram > 0){
        "Porsi kibble harus lebih dari 0 gr"
    }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50

    try {
        dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false)
    } catch (e: DispenserJamException) {
        println(e.message)
    } catch (e: FoodEmptyException) {
        println(e.message)
    } catch (e: Exception) {
        println("General Error (Palingan bug): ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching {
        dispenseKibble(30, 1000, false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("Berikan chicken jerky secara manual.")
    }
}