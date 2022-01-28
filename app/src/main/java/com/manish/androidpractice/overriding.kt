package com.manish.androidpractice

//open class Teacher {
//    open fun teach() {
//        println("Teaching...")
//    }
//}
//
//class MathsTeacher : Teacher() {
//
//    override fun teach() {
//        println("Teaching Maths...")
//    }
//}
//fun main(args: Array<String>) {
//    val teacher = Teacher()
//    val mathsTeacher = MathsTeacher()
//
//    teacher.teach()  // Teaching...
//    mathsTeacher.teach() // Teaching Maths..
//}


open class Employee {
    open val baseSalary: Double = 30000.0
}

class Programmer : Employee() {
    override val baseSalary: Double = 50000.0
}

fun main() {
    val employee = Employee()
    println(employee.baseSalary)

    val programmer = Programmer()
    println(programmer.baseSalary)
}