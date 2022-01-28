package com.manish.androidpractice

fun operators(i: Int, j: Int) {
    println("Arithmetic operator ${i + j} ${i - j} ${i / j} ${i * j} ")
    println("Logical operator ${i == j} ${i != j} ${i is Int && (j == 60)} ${i is Int || j == 50}")
    println("conditional operator ${i < j} ${i > j} ")
    println("bitwise operator ${i and j} ${i or j} ${(i == j).not()} ${i xor j}")
}

private fun demo1() {
    var i = 10
    var j = 20

    println("i + j = ${i + j}")
    println("i - j = ${i - j}")
    println("i * j = ${i * j}")
    println("i / j = ${i / j}")
    println("i == j = ${i == j}")
    println("i != j = ${i != j}")
    println("i++ = ${ i++}")
    println(" --i = ${ --i}")
    println("i & j = ${ i.and(j)}") //inlinefunctionway
    println("i & j = ${ i and j}")
    println("i | j = ${ i or j}")
    println("i ^ j = ${ i xor j}")
    println("i && j = ${ (i > j) && (i > 50) }")
    println("i || j = ${ (i < j) || (i > 10) }")
    println("i <= j = ${ (i <= j)}")
    println("i >= j = ${ (i >= j)}")
    println("Not = ${ !(i == j)}")
    println("Not = ${ (i == j).not()}")

}
fun main() {
    demo1()
}