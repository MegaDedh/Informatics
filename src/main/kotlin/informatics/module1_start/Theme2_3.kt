package informatics.module1_start

import java.util.*
import kotlin.math.PI
import kotlin.math.sin

//Тема 2 Задачи на принадлежность точки закрашенной области

// Задача №112165. Точка - 1
//fun main() {
//
//    val scanner = Scanner(System.`in`).useLocale(Locale.US)
//    val x = scanner.nextDouble()
//    val y = scanner.nextDouble()
//
//    val answer = if (
//        x < 2 &&
//        y > 0 &&
//        y < x &&
//        x * x + y * y > 4)
//        "YES"
//    else "NO"
//
//    println(answer)
//
//}

//Задача №112166. Точка - 2
//fun main() {
//
//    val scanner = Scanner(System.`in`).useLocale(Locale.US)
//    val x = scanner.nextDouble()
//    val y = scanner.nextDouble()
//
//    val answer = if (
//        y > 0 && x > 0 &&
//        y < sin(x) &&
//        y < 0.5 &&
//        x < PI // (! don't forget)
//    )
//        "YES"
//    else "NO"
//
//    println(answer)
//
//}


//Задача №112167. Точка - 3
//https://server.179.ru/wiki/?get=if2cpp.pdf&page=informatika/arxiv/20_15/8b_1/file
//^^^ там правда неверно составлены ответы)))
//fun main() {
//
//    val scanner = Scanner(System.`in`).useLocale(Locale.US)
//    val x = scanner.nextDouble()
//    val y = scanner.nextDouble()
//
//    val answer = if (
//        x<0 &&
//        y<2-x*x && y>x
//        ||
//        x>=0 &&
//        y<2-x*x &&
//        y > 0 )
//        "YES"
//    else "NO"
//
//    println(answer)
//
//}

//Задача №112168. Точка - 4
//fun main() {
//
//    val scanner = Scanner(System.`in`).useLocale(Locale.US)
//    val x = scanner.nextDouble()
//    val y = scanner.nextDouble()
//
//    val answer = if (
//
//        y<x &&
//        y > x*x-2
//        ||
//        y<-x &&
//        y > x*x-2
//    )
//        "YES"
//    else "NO"
//
//    println(answer)
//
//}

//Задача №112169. Точка - 5
//fun main() {
//
//    val scanner = Scanner(System.`in`).useLocale(Locale.US)
//    val x = scanner.nextDouble()
//    val y = scanner.nextDouble()
//
//    val answer = if (
//
//        y<x &&
//        x<0 &&
//        x * x + y * y < 1
//        ||
//        y>=x &&
//        x * x + y * y < 1
//    )
//        "YES"
//    else "NO"
//
//    println(answer)
//
//}

