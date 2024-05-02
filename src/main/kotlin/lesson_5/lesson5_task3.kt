package org.example.lesson_5

fun main() {
    val winningNumber1 = 11
    val winningNumber2 = 22

    println("Введите первое число для проверки:")
    val userNumber1 = readln().toInt()
    println("Введите второе число для проверки:")
    val userNumber2 = readln().toInt()

    val isNumber1Correct = (userNumber1 == winningNumber1 || userNumber1 == winningNumber2)
    val isNumber2Correct = (userNumber2 == winningNumber1 || userNumber2 == winningNumber2)

    when {
        isNumber1Correct && isNumber2Correct -> println("Поздравляем! Вы выиграли главный приз!")
        isNumber1Correct || isNumber2Correct -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")

    }

    println("Правильные числа были: $winningNumber1 и $winningNumber2")


}