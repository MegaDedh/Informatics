package yandex
//Ознакомительный контест

//A. A+B 1
//fun main() {
//    val input = readLine()!!
//
//    val a =  input.split(" ").first().toInt()
//    val b = input.split(" ").last().toInt()
//
//    println(a+b)
//}


//B. A+B 2
import java.io.BufferedReader
import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import java.util.*

//fun main() {
//
//    val input = Scanner(BufferedReader(FileReader("input.txt")))
//    val output = PrintWriter(FileWriter("output.txt"))
//
//    val a: Int = input.nextInt()
//    val b: Int = input.nextInt()
//
//    output.println(a + b)
//
//    input.close()
//    output.flush()
//    output.close()
//}


//C. A+B 3 (то-же самое что и A. A+B 1)


//https://yandex.ru/support/contest/examples-file.html
//!!!Чтение и запись в файл
//import java.io.*
//
//fun main(args: Array<String>) {
//    val input = BufferedReader(FileReader("input.txt"))
//    val output = BufferedWriter(FileWriter("output.txt"))
//
//    val numberStrings = input.readLine()!!.split(" ")
//    output.write((numberStrings[0].toInt() + numberStrings[1].toInt()).toString())
//    output.flush()
//}




//import java.io.BufferedReader
//import java.io.FileReader
//import java.io.FileWriter
//import java.io.PrintWriter
//import java.util.*
//
//
//fun main() {
//    val n = readLine()!!.toInt()
//
//    val listDig = mutableListOf<Int>()
//
//    for (i in 1..n) {
//        // val foo =
//
//        listDig.add(readLine()!!.split(" ").drop(1).maxOf { it.toInt() })// max()// { listDig.add(it.toInt()) }
//
//    }
//
//    listDig.sortDescending()
//
////    println(listDig.toString())
////    println(listDig.lastIndex / 2)
//
//
//    val xxx = if (listDig.lastIndex % 2 ==0){
//        //чет
//        listDig[listDig.lastIndex / 2]
//    } else{
//        listDig[listDig.lastIndex / 2+1]
//    }
//
//    // val xxx = listDig[listDig.lastIndex / 2]
//
//
//    println(xxx)
//}
//
///*
//
//ww 150 50 240
//bed 150 50 230
//tv 20 20 30
//PC 10 40 30
//



// Третья задача сделана как попало. прошло 4 теста.
//fun main() {
//
//    val a = (readLine()!!.split(" ").drop(1).map { it.toInt() })
//    val b = (readLine()!!.split(" ").drop(1).map { it.toInt() })
//    val c = (readLine()!!.split(" ").drop(1).map { it.toInt() })
//
//
//    val aAndB = foo(a, b).toList()
//    val xxx = foo(aAndB, c)
//
//
//    println(xxx.size)
//    println(xxx.toString().removePrefix("[").removeSuffix("]").replace(", "," "))
//
//}
//
//fun foo(x:List<Int>,y:List<Int>):MutableList<Int>{
//    val res = mutableListOf<Int>()
//    res.addAll(x)
//
//    if (isXincudeY(x,y)) return res
//    if (isXincudeY(y,x)) return y.toMutableList()
//
//
//    val yFirst = y.first()
//    if (y.last() == res.first()){
//        res.addAll(0,y.dropLast(1))
//    }else {
//
//
//        if (x.indexOf(yFirst) != -1) {
//            val addY =
//                if (res.getOrNull(x.indexOf(yFirst)+1)==y.last())
//                    y.drop(1).dropLast(1)
//                else
//                    y.drop(1)
//
//            res.addAll(yFirst, addY)
//        } else {
//            res.addAll(y)
//        }
//    }
//    return res
//}
//
//
//fun isXincudeY(x:List<Int>,y:List<Int>):Boolean =
//
//
//    if (x.size > y.size) {
//        var iX = x.indexOf(y.first())
//        var incl = false
//        y.forEach {
//            incl = x.getOrNull(iX) == it
//            iX++
//        }
//        incl
//    } else false
