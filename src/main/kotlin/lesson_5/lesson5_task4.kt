package org.example.lesson_5

const val USER = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введи ваш логин:")
    val userLogin = readln()

    if (userLogin == USER) {
        println("Пожалуйста, введите ваш пароль:")
        val password = readLine()

        if (password == PASSWORD) {
            println("Добро пожаловать на борт, $USER! Готовы к навигации по вселенной.")
        } else {
            println("Неверный пароль. Доступ запрещен.")
        }
    } else {
        println("Пользователь не найден. Пожалуйста, зарегистрируйтесь для доступа к управлению кораблем.")
    }
}