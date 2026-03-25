package oop_140764_JeremiahEJ.week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem(
                "Pedang Kayu Bapuk",
                5,
                ItemRarity.COMMON)
            return Weapon(item, durability = 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem(
                "Sacrificial Sword",
                454,
                ItemRarity.EPIC)
            return Weapon(item, durability = 100)
        }
    }
}