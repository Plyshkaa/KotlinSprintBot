package org.example.lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val MAX_VOLUME = 100
const val NAME_CATEGORY = "Average"

fun main() {

    val productWeight1 = 20
    val productVolume1 = 80

    val productWeight2 = 50
    val productVolume2 = 100


    println(("Груз с весом $productWeight1 кг и объемом $productVolume1 л соответствует категории $NAME_CATEGORY: ${productWeight1 in WEIGHT_MIN..WEIGHT_MAX && productVolume1 < MAX_VOLUME}"))
    println(("Груз с весом $productWeight2 кг и объемом $productVolume2 л соответствует категории $NAME_CATEGORY: ${productWeight2 in WEIGHT_MIN..WEIGHT_MAX && productVolume2 < MAX_VOLUME}"))

}