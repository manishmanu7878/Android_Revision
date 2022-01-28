package com.manish.androidpractice

//
//interface Interface1  {
//    var id: Int
//    fun absMethod():String
//    fun doSomthing() {
//        println("Interface 1")
//    }
//}
//class InterfaceImp : Interface1 {
//    override var id: Int = 101
//    override fun absMethod(): String{
//        return "Interface 1 overridden"
//    }
//}
//fun main() {
//    val obj = InterfaceImp()
//    println("Calling overriding id value = ${obj.id}")
//    obj.doSomthing()
//    println(obj.absMethod())
//}


//multiple interfaces
interface A {
    fun printMe() {
        println(" method of interface A")
    }
}
interface B  {
    fun printMeToo() {
        println(" method of interface B")
    }
}

class multipleInterface: A, B{}

fun main() {
    val obj = multipleInterface()
    obj.printMe()
    obj.printMeToo()
}