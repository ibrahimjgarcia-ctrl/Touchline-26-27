package com.touchline26.app.engine
import kotlin.math.max
import kotlin.random.Random

data class MatchState(
    val homeGoals: Int = 0, val awayGoals: Int = 0, val minute: Int = 0,
    val homeShots: Int = 0, val awayShots: Int = 0,
    val homeXg: Double = 0.0, val awayXg: Double = 0.0
)

class MatchEngine(private val random: Random = Random.Default) {
    fun simulateMinute(state: MatchState, homeStrength: Int, awayStrength: Int): MatchState {
        val hc = max(0.01, (homeStrength - awayStrength + 12) / 160.0)
        val ac = max(0.01, (awayStrength - homeStrength + 9) / 180.0)
        val hs = random.nextDouble() < hc
        val ashot = random.nextDouble() < ac
        val hg = hs && random.nextDouble() < 0.12
        val ag = ashot && random.nextDouble() < 0.12
        return state.copy(
            homeGoals = state.homeGoals + if (hg) 1 else 0,
            awayGoals = state.awayGoals + if (ag) 1 else 0,
            minute = state.minute + 1,
            homeShots = state.homeShots + if (hs) 1 else 0,
            awayShots = state.awayShots + if (ashot) 1 else 0,
            homeXg = state.homeXg + if (hs) 0.12 else 0.0,
            awayXg = state.awayXg + if (ashot) 0.12 else 0.0
        )
    }
}
