package com.manish.androidpractice

//class ToBeCalled {
//    companion object Test {
//        fun callMe() = println("You are calling me :)")
//    }
//}
//fun main() {
//    ToBeCalled.callMe()
//}

class ToBeCalled {
    companion object {
        var someInteger: Int = 10
        fun callMe() = println("You are calling me :)")
    }
}

fun main(args: Array<String>) {
    print(ToBeCalled.someInteger)
}