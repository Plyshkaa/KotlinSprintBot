package org.example.lesson_4

fun main() {
    val trainingDay = 6
    val armsAndAbs = trainingDay % 2 != 0 // Нечётные дни для рук и пресса
    val legsAndBack = trainingDay % 2 == 0 // Чётные дни для ног и спины




    println(
        """
        Упражнения для рук:    $armsAndAbs
        Упражнения для ног:    $legsAndBack
        Упражнения для спины:  $legsAndBack
        Упражнения для пресса: $armsAndAbs
    """.trimIndent()
    )

}