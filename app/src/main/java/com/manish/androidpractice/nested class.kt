package com.manish.androidpractice


class Outer {

    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main() {
    println(Outer.Nested().b)

    val nested = Outer.Nested()
    println(nested.callMe())
}

//class outerClass{
//    private var name: String = "Manish"
//    class nestedClass{
//        var description: String = "Inside nested class"
//        private var id: Int = 101
//        fun foo():Int{
//            var a = 10
//            var b = 20
//           var  c:Int = a+ b
//            return c
//        }
//    }
//}
//fun main(){
//    var obj = outerClass.nestedClass()
//    obj.foo()
//}
