package com.manish.androidpractice

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) {


    abstract var maxSpeed: Double

    abstract fun start()
    abstract fun stop()


    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {

        println("Car Started")
    }

    override fun stop() {

        println("Car Stopped")
    }
}

class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {

        println("Bike Started")
    }

    override fun stop() {

        println("Bike Stopped")
    }
}

fun main() {

    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)

    car.displayDetails()
    motorCycle.displayDetails()

    car.start()
    motorCycle.start()
}

//what is the purpose of creating abstract classes
//The purpose of an abstract class is to provide a blueprint for derived classes and set some rules what the derived classes must implement
//when they inherit an abstract class.we can use an abstract class as a base class and all derived classes must implement abstract definitions.
//we create abstract classes to provide a common template for other classes to extend and use.


//how many types of abstract classes can be created
