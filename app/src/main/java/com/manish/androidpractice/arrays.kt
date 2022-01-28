package com.manish.androidpractice

import java.util.*

//fun main() {
//    val array = intArrayOf(1, 2, 3, 4, 5)
//
//    for (element in array) {
//        println(element)
//    }
//}

//multidimensional array
//fun main() {
//    val array = arrayOf(intArrayOf(1, 2),
//        intArrayOf(3, 4),
//        intArrayOf(5, 6, 7))
//
//    println(Arrays.deepToString(array))
//}

//set get
//fun main()
//{
//    val num = arrayOf(1, 2, 3, 4, 5)
//
//    num.set(0, 10)
//    num.set(1, 6)
//
//    println(num.get(0))
//    println(num[1])
//}

// Traversing an array
//fun main()
//{
//    val array = arrayOf<Int>(1, 2, 3, 4, 5)
//    for (i in 0..array.size-1)
//    {
//        println(array[i])
//    }
//}

//fun main(){
//    var myArray = intArrayOf(5,10,20,12,15)
//
//    for (index in 0..4){
//        println(myArray[index])
//    }
//    println()
//    for (index in 0..myArray.size-1){
//        println(myArray[index])
//    }
//}

fun main(){
    val name = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
    var myArray2 = arrayOf<Int>(1,10,4,6,15)
    var myArray3 = arrayOf(5,10,20,12,15)
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    for(element in name){
        println(element)
    }

    println()
    for(element in myArray2){
        println(element)
    }
    println()
    for(element in myArray3){
        println(element)
    }
    println()
    for(element in myArray4){
        println(element)
    }
    println()
    for(element in myArray5){
        println(element)
    }

}
