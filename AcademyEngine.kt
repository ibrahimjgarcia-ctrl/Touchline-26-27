package com.touchline26.app.engine
import kotlin.random.Random

data class YouthProspect(
    val id: String, val name: String, val position: String,
    val currentAbility: Int, val potential: Int
)

class AcademyEngine(private val random: Random = Random.Default) {
    private val names = listOf("Álex", "Mateo", "Pablo", "Hugo", "Iker", "Dani", "Leo", "Nico")
    private val positions = listOf("POR", "DFC", "MC", "MCO", "ED", "EI", "DC")
    fun generate(year: Int, count: Int = 4): List<YouthProspect> =
        (0 until count).map { i ->
            val ca = random.nextInt(48, 68)
            YouthProspect("newgen-$year-$i", "${names.random(random)} $year",
                positions.random(random), ca, (ca + random.nextInt(12,31)).coerceAtMost(92))
        }
}
