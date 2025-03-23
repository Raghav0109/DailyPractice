fun main() {
    println("Enter two numbers to check the greatest of two:")

    val x = readln().toIntOrNull() ?: 0
    val y = readln().toIntOrNull() ?: 0

    if (x > y) {
        println("The greater number between $x and $y is = $x")
    } else if (x < y) {
        println("The greater number between $x and $y is = $y")
    } else {
        println("Both numbers $x and $y are equal.")
    }
}