package com.manish.androidpractice


class outer {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main() {

    val outer = outer()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = outer().Inner()
    println("Using inner object: ${inner.callMe()}")
}


//class OuterClass{
//    private  var name: String = "Manish"
//    inner class  innerClass{
//        var description: String = "Inside inner class"
//        private var id: Int = 101
//        fun foo(){// access the outer class member even private
//            println("Id is ${id}")
//        }
//    }
//}
//fun main(){
//    println(OuterClass().innerClass().description)
//    var obj = OuterClass().innerClass()
//    obj.foo()
//
//}