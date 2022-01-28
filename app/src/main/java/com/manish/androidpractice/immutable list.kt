package com.manish.androidpractice

//fun main() {
//    val a = listOf("Ram", "Shyam", "Raja", "Rani")
//    println("The size of the list is: "+a.size)
//    println("The index of the element Raja is: "+a.indexOf("Raja"))
//    println("The element at index "+a[2])
//    for(i in a.indices){
//        println(a[i])
//    }
//}

fun main()
{
    val numbers = listOf(1, 5, 7, 32, 0, 21, 1, 6, 10)

    val num1 = numbers.get(0)
    println(num1)

    val num2 = numbers[7]
    println(num2)

    val index1 = numbers.indexOf(1)
    println("The first index of number is $index1")

    val index2 = numbers.lastIndexOf(1)
    println("The last index of number is $index2")

    val index3 = numbers.lastIndex
    println("The last index of the list is $index3")
      println(numbers.first())
      println(numbers.last())

   val asc = numbers.sorted()
   println(asc)

   val desc = numbers.sortedDescending()
   println(desc)
}