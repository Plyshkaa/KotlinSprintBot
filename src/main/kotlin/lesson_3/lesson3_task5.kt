package org.example.lesson_3

fun main() {
    val playerMove = "D2-D4;0"
    val parts = playerMove.split("-")
    val initialPosition = parts[0]
    val endAndMoveNumber = parts[1].split(";")
    val finalPosition = endAndMoveNumber[0]
    val moveNumber = endAndMoveNumber[1].toInt()

    println("Initial position: $initialPosition")
    println("Final position: $finalPosition")
    println("Move number: $moveNumber")
}