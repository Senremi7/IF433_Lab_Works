package oop_140764_JeremiahEJ.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items

    fun pencarian(item: T)
    : List<T> {
        return items.filter { it == item }
    }
}