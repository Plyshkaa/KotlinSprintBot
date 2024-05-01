package org.example.lesson_4

fun main() {
    val trainingDay = 6
    val isEven = trainingDay % 2 == 0

    val armsAndAbs = !isEven // Нечётные дни для рук и пресса
    val legsAndBack = isEven // Чётные дни для ног и спины


    println(
        """
        Упражнения для рук:    $armsAndAbs
        Упражнения для ног:    $legsAndBack
        Упражнения для спины:  $legsAndBack
        Упражнения для пресса: $armsAndAbs
    """.trimIndent()
    )

}