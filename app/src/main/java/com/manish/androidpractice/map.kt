package com.manish.androidpractice

fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMap)

    val theMutableMap = mutableSetOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMutableMap)

    val theMap1 = HashMap<String, Int>()

    theMap1["one"] = 1
    theMap1["two"] = 2
    theMap1["three"] = 3
    theMap1["four"] = 4

    println(theMap1)

    val theMap2 = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    println("Entries: " + theMap2.entries)
    println("Keys:" + theMap2.keys)
    println("Values:" + theMap2.values)

    val firstMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val secondMap = mapOf("one" to 10, "four" to 4)
    val resultMap = firstMap + secondMap
    println(resultMap)

    val theMap3 = mapOf("one" to 1, "two" to 2, "three" to 3)
    val theKeyList = listOf("one", "four")
    val resultMap1 = theMap - theKeyList
    println(resultMap1)

//    val myMap: Map<Int, String> = mapOf<Int,String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
//    for(key in myMap.keys){
//        println("Element at key $key = ${myMap.get(key)}")
//    }
}