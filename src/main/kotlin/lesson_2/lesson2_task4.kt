package org.example.lesson_2

const val buff = 20

fun main() {
    val crystal = 7
    val iron = 11


    val resultIronBuff = (crystal * buff) / 100.toDouble()
    val resultCrystalBuff = (iron * buff) / 100.toDouble()

    println("Бонусные кристаллы: $resultCrystalBuff")
    println("Бонусная железная руда: $resultIronBuff")
}