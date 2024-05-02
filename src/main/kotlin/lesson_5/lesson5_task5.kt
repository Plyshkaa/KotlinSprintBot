package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val winningNumbers = List(3) { Random.nextInt(0, 43) }
    val userNumbers = mutableListOf<Int>()

    println("Введите три числа от 0 до 42:")
    repeat(3) {
        userNumbers.add(readlnOrNull()?.toIntOrNull() ?: 0)
    }

    val guessedNumbers = userNumbers.intersect(winningNumbers.toSet()).size

    when (guessedNumbers) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Отлично! Вы угадали два числа и получаете крупный приз.")
        1 -> println("Вы угадали одно число. Вам выплачивается утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: ${winningNumbers.joinToString(", ")}")

}