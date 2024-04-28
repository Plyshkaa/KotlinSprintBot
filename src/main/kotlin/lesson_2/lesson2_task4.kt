package org.example.lesson_2

const val maxPercent = 100

fun main() {
    val crystal = 7
    val iron = 11
    val buff = 20


    val resultIronBuff = (crystal * buff) / maxPercent.toDouble()
    val resultCrystalBuff = (iron * buff) / maxPercent.toDouble()

    println("Бонусные кристаллы: $resultCrystalBuff")
    println("Бонусная железная руда: $resultIronBuff")
}