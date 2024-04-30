package org.example.lesson_4

const val maxCountCrew = 70
const val minCountCrew = 55
const val minCountBox = 50

fun main() {
    print("Корабль имеет повреждения?")
    val hasDamageShip = readLine().toBoolean()

    print("Каков состав экипажа?")
    val countCrew = readln().toInt()

    print("Количество ящиков с провизией на борту?")
    val countBox = readln().toInt()

    print("Условия благоприятные?")
    val hasConditions = readLine().toBoolean()

    val flyVer1 = (!hasDamageShip && countCrew in minCountCrew..maxCountCrew && countBox > minCountBox) ||
            (hasDamageShip && countCrew == maxCountCrew && countBox >= minCountBox && hasConditions)

    println("Может ли корабль отправиться в плавание? $flyVer1")
}