package org.example.lesson_4

const val airHumidity = 20
const val currentYear = "Зима"
fun main() {
    val weather = true
    val awning = true
    val currentSeason = "Зима"

    val isGrowingSeason = currentSeason != currentYear
    val isIdealHumidity = airHumidity == airHumidity
    val harvest = weather && awning && isIdealHumidity && isGrowingSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $harvest”")
}
