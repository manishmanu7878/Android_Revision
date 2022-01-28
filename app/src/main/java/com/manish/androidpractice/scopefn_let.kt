package com.manish.androidpractice

fun main() {
    var a: Int? = null

    a?.let {
        print(it)
    }

    a = 2
    a?.let {
        print(a)
    }
}

//let is used as null pointer exception