package com.manish.androidpractice

fun main() {

    val mutableListA = mutableListOf<Int>( 1 , 2 , 3 , 4 , 3);
    println(mutableListA)

    val mutableListB = mutableListOf<String>("Kotlin","for" , "Android");
    println(mutableListB)

    val mutableListC = mutableSetOf<Int>()
    println("Empty list "+mutableListC )
//adding removing
    var mutablelistD=mutableListOf("Kotlin", "For");
    mutablelistD.add("Android")
    for(i in mutablelistD)
        println(i)
    println("... after removing For ...")

    mutablelistD.remove("For")
    for(i in mutablelistD)
        println(i)

//set indexing,first and last element
    val chocolates = mutableListOf("Dairymilk","5star","Munch","Kitkat","Perk",1,2,3,4,5)

    println("The element at index 2 is: "+chocolates.elementAt(2))

    println("The index of element is: "+chocolates.indexOf("Munch"))

    println("The last index of element is: "+chocolates.lastIndexOf("Kitkat"))

    println("The first element of the list is: "+chocolates.first())

    println("The last element of the list is: "+chocolates.last())

    //Contains()
    var name = "Munch"
    println("The list contains the element $name or not?" +
            "   "+chocolates.contains(name))

    var num = 5
    println("The list contains the element $num or not?" +
            "   "+chocolates.contains(num))

    println("The list contains the given elements or not?" +
            "   "+chocolates.containsAll(setOf(1,3,"Perk")))
}