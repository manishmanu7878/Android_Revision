package com.manish.androidpractice

class Person {
    var name: String = "defaultValue"

        get() = field

        set(value) {
            field = value
        }
fun main() {

    val p = Person()
    p.name = "manish"
    println("${p.name}")
}


}




//private class GetSet(
//    private var xPos : Int
//) {
//    var x : Int
//        get() = this.xPos
//        set(value) { this.xPos = value }
//}
//
//fun main() {
//    val gt1 = GetSet(10)
//    gt1.x = 10
//
//    println("X - ${gt1.x}")
//
//
//}