fun main(){
    print("Enter number to check wheter it is even or ODD")

    val x = readln().toIntOrNull() ?:0

    if(x%2==0){
        print("the given number is $x is Even")
    }

    else
    {print("the given number is $x is odd")
    }


}