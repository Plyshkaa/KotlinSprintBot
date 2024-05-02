package org.example.lesson_5

const val CORRECT_ANSWER = 4

fun main() {
    println("Введите правильный ответ на задачу: 2 + 2 = ")
    val answer = readln().toInt()

    if (answer == CORRECT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}