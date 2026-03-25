package oop_140764_JeremiahEJ.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(45),
    UNCOMMON(30),
    RARE(19),
    EPIC(5),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity)