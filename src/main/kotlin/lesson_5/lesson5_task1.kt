package org.example.lesson_5

fun main() {
    val rightAnswer = 2+2
    println("Введите правильный ответ на задачу: 2 + 2 = ")
    val answer = readln().toInt()

    if (answer == rightAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}