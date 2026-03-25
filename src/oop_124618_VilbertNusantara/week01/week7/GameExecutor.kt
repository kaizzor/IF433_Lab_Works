package oop_124618_VilbertNusantara.week01.week7

fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.MonsterEncounter -> "Monster: ${event.monsterName}"
        is BattleState.LootDropped -> "Loot: ${event.item.name} (${event.item.rarity})"
        is BattleState.GameOver -> "Game Over: ${event.reason}"
        BattleState.SafeZone -> "Safe Zone"
    }
    println(message)
}