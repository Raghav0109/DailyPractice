import java.math.BigInteger

fun factoraisl(n:Long) :BigInteger
{
    if(n<=1) {
        return BigInteger.ONE
    }
    else
    {
        return BigInteger.valueOf(n)*factoraisl(n-1)
    }

}
fun main()
{
    println("Enter the value")
    val num= readln().toLongOrNull()?:0
    val res=factoraisl(num)
//printing values here
    println("$res")
}
