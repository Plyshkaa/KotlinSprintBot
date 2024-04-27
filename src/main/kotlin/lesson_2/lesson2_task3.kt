package org.example.lesson_2

const val trainExitHour: Int = 9
const val trainExitMinute: Int = 39
const val travelTime: Int = 457

fun main() {

    val totalMinutesFromMidnight = trainExitHour * 60 + trainExitMinute + travelTime
    val arrivalHour = (totalMinutesFromMidnight / 60) % 24
    val arrivalMinute = totalMinutesFromMidnight % 60

    println("Поезд прибудет в $arrivalHour часов и $arrivalMinute минут.")
}