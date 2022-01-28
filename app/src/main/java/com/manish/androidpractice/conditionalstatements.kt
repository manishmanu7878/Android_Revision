package com.manish.androidpractice

fun main() {
    val age:Int = 13

    val result = if (age > 19) {
        "Adult"
    } else if ( age > 12 && age  < 20 ){
        "Teen"
    } else {
        "Minor"
    }
    print("The value of result : ")
    println(result)
}