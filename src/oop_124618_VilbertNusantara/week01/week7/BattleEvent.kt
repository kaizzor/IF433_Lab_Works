package oop_124618_VilbertNusantara.week01.week7

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}