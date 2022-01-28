package com.manish.androidpractice

fun main(args: Array<String>) {
    for (item in 5 downTo 1 step 2) {
        println(item)
    }
}

private fun forloop() {
    val nums = intArrayOf(56, 89, 23, 78, 65, 20, 12, 103)

    for (i in nums.indices) {
        println(" index = $i, value = ${nums[i]}")
    }

    for (value in nums) {
        println("value = $value")
    }

    for ((index, value) in nums.withIndex()) {
        println("Index ${index}, Value = $value")
    }

    for (i in 0 until nums.size - 2) {
        println(i)
    }
}

private fun whilellop() {

    var i = 0
    while(i < 10) {
        i = i + 1
        println("I is $i")
    }

    var j = 0
    do {
        j = j + 1
        println("J is $j")
    }while( j < 10 )
}

private fun when1(){
    val day = 2

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}