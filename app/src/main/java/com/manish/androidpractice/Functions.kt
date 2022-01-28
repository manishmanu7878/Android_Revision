package com.manish.androidpractice





private fun addition(
    num1: Int,
    num2: Int
): Int {
    return num1 + num2
}

private fun rtnTyp(): Unit {
   println("Just Call")
}

// inline function
private fun nTimes(num: Int, n: Int) = n * num


private infix fun Unit.square(n: Int) = n * n


//infix functions
//class math {
//
//    infix fun square(n : Int): Int{
//        val num = n * n
//        return num
//    }
//}
//fun main(args: Array<String>) {
//    val m = math()
//    // call using infix notation
//    val result = m square 3
//    print("The square of a number is: "+result)
//}


//lambda functions
val sum:(Int,Int) -> Int = { a, b -> a + b}

//val sum1 = { a: Int, b: Int -> a + b }
//val sum2:(Int,Int)-> Int  = { a , b -> a + b}
//
//fun main() {
//    val result1 = sum1(2,3)
//    val result2 = sum2(3,4)
//    println("The sum of two numbers is: $result1")
//    println("The sum of two numbers is: $result2")
//
//    // we can  directly print the return value of lambda without storing in a variable.
//    println(sum1(5,7))
//}





fun main() {


    println("Addition is ${addition(12, 3)}")
    rtnTyp()
    println("10 3 Times is ${nTimes(10, 3)}")


    println(" Square is ${Unit square  2}")
    println(" Square is ${Unit.square(2)}")


}