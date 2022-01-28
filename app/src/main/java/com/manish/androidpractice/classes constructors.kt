package com.manish.androidpractice

private class Empty1 {}
private class Empty2



private class Cls1 constructor(nm: String)
private class Cls2(nm: String)

private class Cls3(nm: String) {
    val name = nm

    fun whatYourName(): String {
        return name
    }
}
private class Cls4(val name: String) {
    fun whatYourName() = name
}

private class Cls5 {
    val dt : String

    constructor(d: String) {
        dt = d
    }
}

private class Cls6(val dt : String) {
    val dt1 : String
    constructor(d: String,  n: Int): this(d) {
        println("called secondary 1")
    }
    constructor(d: String,  n: Double): this(d) {
        println("called secondary 2")
    }
    constructor(d: String,  n: Double, b : Boolean): this(d) {
        println("called secondary 2")
    }
    init {
        println("Called init 1 ${dt}")
        dt1 = "sasdaklfjksjfjd"
    }
    init {
        println("Called init 2 $dt")
    }

    fun whatsDt() = dt
}

private fun demo1() {
    val c1 = Cls3("android")
    println("Name is ${c1.whatYourName()}")

    val c2 = Cls3("iOS")
    println("Name is ${c2.whatYourName()}")

    val c3 = Cls4("again android")
    println("Name is ${c3.whatYourName()}")

    val c4 = Cls5("android")
    println(" Dt is ${c4.dt}")
}

fun main() {
    val c5 = Cls6("primary")
    val c6 = Cls6("primary", 10)
    val c7 = Cls6("primary", 10.6)
    val c8 = Cls6("primary", 10.6, true)
}

//need to look after the companion object
//need to decalred after a class
