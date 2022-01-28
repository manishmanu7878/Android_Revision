package com.manish.androidpractice


//apply
class Company() {
    lateinit var name: String
    lateinit var competency: String
    lateinit var role: String
}

fun main() {
    Company().apply {
        this.name = "Pwc"
        this.role = "Associate"
        this.competency = "Mobility-Android"
    }
}