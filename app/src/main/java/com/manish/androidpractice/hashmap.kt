package com.manish.androidpractice

fun main(){
        val kvDs = HashMap<Int, String>()
        kvDs[1]="abc"
        kvDs[2]= "pqr"
        kvDs[3]= "lmn"
        kvDs[4]= "xyz"
        kvDs[5]= "def"
        kvDs[6]= "hij"
        kvDs[7]= "hij"

        kvDs.entries.forEach {
                entry -> println("Key - ${entry.key} Value - ${entry.value}")
        }
        kvDs.entries.forEach(::println)

        for ( (k,v) in kvDs ) {
            println("Key - $k Value - $v")
        }
}

//fun main(){
//
//    val intMap: HashMap<Int, String> = hashMapOf<Int,String>(1 to "Ashu",4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")
//
//    val stringMap: HashMap<String,String> = hashMapOf<String,String>("name" to "Ashu")
//    stringMap.put("city", "Delhi")
//    stringMap.put("department", "Development")
//    stringMap.put("hobby", "Playing")
//    val anyMap: HashMap<Any, Any> = hashMapOf<Any, Any>(1 to "Ashu", "name" to "Rohsan", 2 to 200)
//    println(".....traverse intMap........")
//    for(key in intMap.keys){
//        println(intMap[key])
//    }
//    println("......traverse stringMap.......")
//    for(key in stringMap.keys){
//        println(stringMap[key])
//    }
//    println("......traverse anyMap.......")
//    for(key in anyMap.keys){
//        println(anyMap[key])
//    }
//}

//fun main(){
//
//    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
//    stringMap.put("name", "Ashu")
//    stringMap.put("city", "Delhi")
//    stringMap.put("department", "Development")
//    stringMap.put("hobby", "Playing")
//
//    println("......traverse stringMap.......")
//    for(key in stringMap.keys){
//        println("Key = ${key} , value = ${stringMap[key]}")
//    }
//
//    println("......stringMap.containsKey(\"name\").......")
//    println(stringMap.containsKey("name"))
//}

//fun main(){
//
//    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
//    stringMap.put("name", "Ashu")
//    stringMap.put("city", "Delhi")
//    stringMap.put("department", "Development")
//    stringMap.put("hobby", "Playing")
//
//    println("......traverse stringMap.......")
//    for(key in stringMap.keys){
//        println("Key = ${key} , value = ${stringMap[key]}")
//    }
//
//    println("......stringMap.replace(\"city\",\"Mumbai\").......")
//    println(stringMap.replace("city","Mumbai"))
//    println("......traverse stringMap after stringMap.replace(\"city\",\"Mumbai\").......")
//    for(key in stringMap.keys){
//        println("Key = ${key} , value = ${stringMap[key]}")
//    }
//}