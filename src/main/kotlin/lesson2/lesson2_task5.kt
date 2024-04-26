package org.example.lesson2

fun main() {
    val clientSum = 70000
    val interestRate = 16.7 / 100
    val billingPeriods = 20

    val finalAmount = clientSum * Math.pow(1 + interestRate, billingPeriods.toDouble())

    println(String.format("%.3f", finalAmount))

}