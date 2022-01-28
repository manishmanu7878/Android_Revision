package com.manish.androidpractice

class car {
    var speed = 10
    fun speedUp() = speed++
    fun putNthGear(n: Int) {
        println("speed is ${speedUp() * n}")
    }
}

fun main() {
    val c = car()
    c.speedUp()
    c.putNthGear(2)
}

//println is a ui element must not be part of classes and should be put in main function
//way of calling classes from ui thread should be smart enough

