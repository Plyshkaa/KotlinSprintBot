package org.example.lesson_5

const val AGE_MAJORITY = 18

fun main() {
    print("Введите ваш год рождения:")
    val year = readln().toInt()
    val currentYear = 2024
    val ageVerification = currentYear - year

    if (ageVerification >= AGE_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Скрытиый контент не доступен")

}