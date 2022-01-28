package com.manish.androidpractice

open class BankAccount(val accountNumber: String, val accountName: String) {
    var balance : Double = 0.0

    fun depositeMoney(amount: Double): Boolean {
        if(amount > 0) {
            balance += amount
            return true
        } else {
            return false
        }
    }

    fun withdrawMoney(amount: Double): Boolean {
        if(amount > balance) {
            return false
        } else {
            balance -= amount
            return true
        }
    }

}

class SavingsAccount (accountNumber: String, accountName: String, val interestRate: Double) : BankAccount(accountNumber, accountName) {

    fun depositInterest() {
        val interest = balance * interestRate / 100
        this.depositeMoney(interest);
    }
}

fun main() {
    // Creating a Savings Account with 6% interest rate
    val savingsAccount = SavingsAccount("63007757575", "sai", 6.0)

    savingsAccount.depositeMoney(1000.0)

    savingsAccount.depositInterest()

    println("Current Balance = ${savingsAccount.balance}")

    savingsAccount.withdrawMoney(1000.0)

    println("Current Balance = ${savingsAccount.balance}")



}
