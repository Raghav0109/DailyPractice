fun main() {
    // Taking input for principal amount, rate of interest, and time
    println("Enter the principal amount:")
    val principal = readLine()!!.toDouble()

    println("Enter the rate of interest:")
    val rate = readLine()!!.toDouble()

    println("Enter the time period in years:")
    val time = readLine()!!.toDouble()

    // Calculating simple interest
    val simpleInterest = (principal * rate * time) / 100

    // Printing the result
    println("The Simple Interest is: $simpleInterest")
}