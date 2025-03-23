fun main(){
    println("enter number to calculate factorial")

    val num = readln().toIntOrNull()?:0

    var factorial=1

    for(i in 1..num)
    {
        factorial *=i
    }
    println("the factorial of a given number $num is $factorial")
}