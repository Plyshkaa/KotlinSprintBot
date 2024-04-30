package org.example.lesson_3

fun main() {
    val playerMove = "D2-D4;0"
    val parts = playerMove.split("-", ";")
    val initialPosition = parts[0]
    val finalPosition = parts[1]
    val moveNumber = parts[2].toInt()

    println("Initial position: $initialPosition")
    println("Final position: $finalPosition")
    println("Move number: $moveNumber")
}