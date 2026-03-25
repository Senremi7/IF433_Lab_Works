package oop_140764_JeremiahEJ.week07

fun processEvent(event: BattleState){
    val msg = when(event){
        is BattleState.MonsterEncounter -> "You have encountered a ${event.monsterName}!"
        is BattleState.LootDropped -> "You found a ${event.item.name}!"
        is BattleState.SafeZone -> "You are in a safe zone. Take a rest!"
        is BattleState.GameOver -> "Game over! ${event.reason}"
    }
    println(msg)
}