package org.example.lesson_4


const val COUNT_TABLE = 13
fun main() {
    val reservedTableToday = 13
    val reservedTableTomorow = 9

    val checkReserveToday: Boolean = reservedTableToday !== COUNT_TABLE
    val checkReserveTommorow: Boolean = reservedTableTomorow !== COUNT_TABLE

    println("Доступность столиков на сегодня: $checkReserveToday")
    println("Доступность столиков на завтра: $checkReserveTommorow")
}