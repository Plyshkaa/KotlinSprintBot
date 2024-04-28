package org.example.lesson_2

const val hours = 60
const val day = 24

fun main() {
    val travelTime: Int = 457
    val trainExitMinute: Int = 39
    val trainExitHour: Int = 9

    val totalMinutesFromMidnight = trainExitHour * hours + trainExitMinute + travelTime
    val arrivalHour = (totalMinutesFromMidnight / hours) % day
    val arrivalMinute = totalMinutesFromMidnight % hours

    println("Поезд прибудет в $arrivalHour часов и $arrivalMinute минут.")
}