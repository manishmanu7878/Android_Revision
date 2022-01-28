package com.manish.androidpractice

class Company1() {
    lateinit var name: String
    lateinit var competency: String
    lateinit var role: String
}
fun main() {
    println("Company Name : ")
    var company: Company1? = null
    company?.run {
        print(name)
    }
    print("Company Name : ")
    // re-initialize company
    company = Company1().apply {
        name = "Pwc"
        role = "Associate"
        competency = "Mobility-Android"
    }

    company?.run {
        print(name)
    }
}