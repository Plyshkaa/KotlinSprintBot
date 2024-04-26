package org.example.lesson_2

fun main() {
    val crystal = 7
    val iron = 11
    val buff = 0.2

    val resultIronBuff: Int = (crystal * buff).toInt()
    val resultCrystalBuff: Int = (iron * buff).toInt()

    println("Бонусные кристаллы: $resultCrystalBuff")
    println("Бонусная железная руда: $resultIronBuff")
}