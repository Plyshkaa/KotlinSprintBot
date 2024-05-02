package org.example.lesson_4

const val MAX_COUNT_CREW = 70
const val MIN_COUNT_CREW = 55
const val MIN_COUNT_BOX = 50

fun main() {
    print("Корабль имеет повреждения?")
    val hasDamageShip = readLine().toBoolean()

    print("Каков состав экипажа?")
    val countCrew = readln().toInt()

    print("Количество ящиков с провизией на борту?")
    val countBox = readln().toInt()

    print("Условия благоприятные?")
    val hasConditions = readLine().toBoolean()

    val flyVer1 = (!hasDamageShip && countCrew in MIN_COUNT_CREW..MAX_COUNT_CREW && countBox > MIN_COUNT_BOX) ||
            (hasDamageShip && countCrew == MAX_COUNT_CREW && countBox >= MIN_COUNT_BOX && hasConditions)

    println("Может ли корабль отправиться в плавание? $flyVer1")
}