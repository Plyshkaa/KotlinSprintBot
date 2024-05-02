package org.example.lesson_4

const val IDEAL_AIR_HUMIDITY = 20
const val GROWING_SEASON = "Зима"
const val IS_SUNNY_WEATHER = true
const val IS_AWNING_OPEN = true

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val currentSeason = "Зима"
    val airHumidity = 20

    val areConditionsFavorable: Boolean = isSunny == IS_SUNNY_WEATHER && isAwningOpen == IS_AWNING_OPEN &&
            airHumidity == IDEAL_AIR_HUMIDITY && currentSeason != GROWING_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areConditionsFavorable”")
}
