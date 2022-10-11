package tasks

fun mirrorString() {

    val inputStr = "Мама мыла раму"
    var outputStr = ""

    for (i in inputStr.lastIndex downTo 0) {
        outputStr = outputStr.plus(inputStr[i])
    }

    //inputStr.forEachIndexed { index, c -> }

    println("output: $outputStr")
}