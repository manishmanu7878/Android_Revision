package com.manish.androidpractice

fun main() {
    var arraylist = ArrayList<String>()
    arraylist.add("Kotlin")

    arraylist.add("Android")

    println("Array list ---->")
    for(i in arraylist)
        println(i)

    arraylist.add( 1 , "For")
    println("Arraylist after insertion ---->")

    for(i in arraylist)
        println(i)

    arraylist.set(3,"assignment in kotlin")
    for(i in arraylist)
        print("$i ")

    println("The index of the element is: "+arraylist.indexOf("Kotlin"))

    arraylist.remove("for")
    for(i in arraylist)
        print("$i ")


    var arraylist1=ArrayList<String>()//adding all elements from arraylist to arraylist1
    println("Elements in arraylist1 -->")
    arraylist1.addAll(arraylist)
    for(i in arraylist1)
        println(i)

    var arraylist2=ArrayList<Int>()

    arraylist2.add(10)
    arraylist2.add(20)
    arraylist2.add(30)
    arraylist2.add(40)
    arraylist2.add(50)


    for(i in arraylist2)
        print("$i ")
    println()
    println("Accessing the index 2 of arraylist: "+arraylist2.get(3))

    for(i in arraylist2)
        print("$i ")
    arraylist2.clear()
    println()
    println("The size of arraylist after clearing all elements: "+arraylist2.size)
}