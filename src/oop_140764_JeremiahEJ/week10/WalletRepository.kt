package oop_140764_JeremiahEJ.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) = items.add(item)

    fun getAllItems(): List<T> = return items
}