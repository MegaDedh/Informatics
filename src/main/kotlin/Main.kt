import java.util.*


fun main() {

    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val x = scanner.nextDouble()
    val y = scanner.nextDouble()

    val answer = if (

        y<x &&
        x<0 &&
        x * x + y * y < 1
        ||
        y>=x &&
        x * x + y * y < 1
         )
        "YES"
    else "NO"

    println(answer)

}