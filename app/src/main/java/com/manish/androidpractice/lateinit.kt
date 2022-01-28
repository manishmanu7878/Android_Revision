package com.manish.androidpractice

class Training {

    lateinit var trainerName : String

    fun initializeName(){
//        println(this::trainerName.isInitialized)

        trainerName = "Aniruddha"
//        println(this::trainerName.isInitialized)
    }
}

fun main() {
    Training().initializeName();
}