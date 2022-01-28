package com.manish.androidpractice

sealed class MyExample {
    class OP1 : MyExample()
    class OP2 : MyExample()
}
fun main() {
    val obj: MyExample = MyExample.OP2()

    val output = when (obj) {
        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "option Two has been chosen"
    }

    println(output)
}

//fun main() {
//    var a = 4
//    var b = 3
//    var operation1 = Add(a, b)
//    var result1 = execute(operation1)
//    println("Addition : "+result1)
//
//    var operation2 = Subtract(a, b)
//    var result2 = execute(operation2)
//    println("Subtraction : "+result2)
//
//    var operation3 = Multiply(a, b)
//    var result3 = execute(operation3)
//    println("Multiplication : "+result3)
//
//    var operation4 = Divide(a, b)
//    var result4 = execute(operation4)
//    println("Division : "+result4)
//}
//
//sealed class ArithmeticOperation
//
//class Add(var a: Int, var b: Int): ArithmeticOperation()
//class Subtract(var a: Int, var b: Int): ArithmeticOperation()
//class Multiply(var a: Int, var b: Int): ArithmeticOperation()
//class Divide(var a: Int, var b: Int): ArithmeticOperation()
//
//fun execute(op: ArithmeticOperation) = when (op) {
//    is Add -> op.a + op.b
//    is Subtract -> op.a - op.b
//    is Multiply -> op.a * op.b
//    is Divide -> op.a / op.b
//}