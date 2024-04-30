package org.example.lesson_4

fun main() {
    val weather = true
    val awning = true
    val airHumidity = 20
    val currentYear = "Зима"
    val harvest: Boolean = weather && awning && (airHumidity == 20) && (currentYear != "Зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $harvest”")
}
