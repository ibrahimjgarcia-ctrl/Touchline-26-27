package com.touchline26.app.engine
data class Fixture(val id: String, val homeClubId: String, val awayClubId: String, val date: String)
class SeasonEngine {
    fun advance(fixtures: List<Fixture>, completedIds: Set<String>) =
        fixtures.filterNot { it.id in completedIds }
}
