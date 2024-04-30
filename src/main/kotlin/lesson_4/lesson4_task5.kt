package org.example.lesson_4

fun main() {
    print("Корабль имеет повреждения?")
    val damageShip = readLine().toBoolean()

    print("Каков состав экипажа?")
    val countCrew = readln().toInt()

    print("Количество ящиков с провизией на борту?")
    val countBox = readln().toInt()

    print("Условия благоприятные?")
    val conditions = readLine().toBoolean()

    val flyVer1 = (!damageShip && countCrew in 55..70 && countBox > 50) ||
            (damageShip && countCrew == 70 && countBox >= 50 && conditions)

    println("Может ли корабль отправиться в плавание? $flyVer1")
}