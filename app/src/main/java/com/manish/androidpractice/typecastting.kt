private fun check1() {
    val age = 10
    val str = "manish"
    println(" is str a String ${str is String}" )
    println(" is str not a String ${str !is String}" )
    println(" is Age a Integer ${age is Int}")
}

fun main() {

    val stNum1 = "122"
    val num1 = stNum1.toInt()
   val s1 = 122
    val st = s1.toString()
    val num2 = 144.05
    val num3 = num2.toInt()
    val chr = 'c'
    println("Ascii  ${chr.code}")

    println("Num1 $num1, st $st, Num3 $num3")

}

