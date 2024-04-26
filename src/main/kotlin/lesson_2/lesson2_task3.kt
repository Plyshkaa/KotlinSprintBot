package org.example.lesson_2

fun main() {
    val trainExitHour = 9
    val trainExitMinut = 39
    val travelTime = 457
    val totalMinutesFromMidnight = trainExitHour * 60 + trainExitMinut + travelTime
    val arrivalHour = (totalMinutesFromMidnight / 60) % 24
    val arrivalMinute = totalMinutesFromMidnight % 60

    println("Поезд прибудет в $arrivalHour часов и $arrivalMinute минут.")
}