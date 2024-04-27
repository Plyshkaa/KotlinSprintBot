package org.example.lesson_1

const val HOURS: Int = 60

fun main() {

//    # Количество секунд, которое Гагарин провел в космосе
    val totalSeconds = 6480
//    # Переводим секунды в часы
    val hours = totalSeconds / 3600
    val remainingSeconds = totalSeconds % 3600
//    # Переводим оставшиеся секунды в минуты
    val minutes = remainingSeconds / HOURS
    val seconds = remainingSeconds % HOURS
//    # Форматируем вывод, чтобы время отображалось двумя цифрами
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

//    # Выводим результат в консоль
    print(formattedTime)
}