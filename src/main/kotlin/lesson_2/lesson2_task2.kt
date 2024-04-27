package org.example.lesson_2

fun main() {
    val oldEmployeesCount = 50
    val oldEmployeesSalary = 30000
    val youngEmployeesCount = 30
    val youngEmployeesSalary = 20000

    val paymentsOld = oldEmployeesCount * oldEmployeesSalary // Общиие затраты на старых сотрудников
    val paymentsYoung = youngEmployeesSalary * youngEmployeesCount // Общие затраты на стажеров
    val commonPayments = paymentsYoung + paymentsOld // Общиие затраты после прихода стажеров

    println(commonPayments / (oldEmployeesCount + youngEmployeesCount))
}