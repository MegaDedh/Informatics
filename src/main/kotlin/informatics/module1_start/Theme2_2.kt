package informatics.module1_start

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

//Тема 2 Стартовый модуль Задачи на арифметические операции

//Задача A №2941. Последняя цифра
//fun main() {
//    val a: Int = readLine()!!.toInt()
//
//    println(a % 10)
//}

//Задача №2942. Число десятков двузначного числа
//fun main() {
//    val a: Int = readLine()!!.toInt()
//
//    println(a / 10)
//}

// Задача №2943. Число десятков
//fun main() {
//    val a: Int = readLine()!!.toInt()
//
//    println(a / 10 % 10)
//}

// Задача №2945. Следующее четное
//fun main() {
//    var a: Int = readLine()!!.toInt()
//    a++
//    a += a % 2
//    println(a)
//}

//Задача №2947. Электронные часы - 1
//fun main() {
//    val n: Int = readLine()!!.toInt()
//    val hour = (n / 60) % 24
//    val min = n % 60
//
//    println(hour)
//    println(min)
//}

// Задача №2950. Конец уроков
//fun main() {
//    val n: Int = readLine()!!.toInt()
//
//    val perem5min = n / 2 * 5
//    val perem15min = (n - 1) / 2 * 15
//    val resultMin = n * 45 + perem5min + perem15min + 9 * 60
//    val hour = (resultMin / 60) % 24
//    val min = resultMin % 60
//
//    println(hour)
//    println(min)
//}


// Задача №112145. Три числа
//fun main() {
//
//    val scanner = Scanner(System.`in`)
//    val a = scanner.nextInt()
//    val b = scanner.nextInt()
//    val c = scanner.nextInt()
//
//    val sum = a + b + c
//    val mult = a * b * c
//    val midle = sum / 3F
//
//    val formatted = DecimalFormat("#0.000", DecimalFormatSymbols(Locale.US)).format(midle)
//
//    println("$a+$b+$c=$sum")
//    println("$a*$b*$c=$mult")
//    println("($a+$b+$c)/3=$formatted")
//}

// Задача №112147. 10-я степень
//fun main() {
//    val a: Float = readLine()!!.toFloat()
//
//    val b = a * a
//    val c = b * b
//    val d = c * c
//    val e = d * b
//    val formatted = DecimalFormat("#0.000", DecimalFormatSymbols(Locale.US)).format(e)
//
//    println(formatted)
//}

// Задача №2957. Проверьте делимость
//fun main() {
//    val a: Int = readLine()!!.toInt()
//    val b: Int = readLine()!!.toInt()
//
//
//    val x1 = a % b
//    val x2 = b % a
//    val result = x1 * x2 + 1
//
//    println(result)
//}