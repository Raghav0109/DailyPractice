fun main(){
    print("enter two number to add")

    val  num1 =   readlnOrNull()?.toIntOrNull() ?: 0

    val  num2 =  readlnOrNull()?.toIntOrNull() ?: 0
    val sum = num1+num2
    print("sum of $num1 and $num2 is = $sum")
}