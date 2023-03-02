package app

import data.ExecuticeCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Andry")
    println(premiumCustomer.name)

    val executiceCustomer = ExecuticeCustomer("Andry", 1000000)
    println(executiceCustomer.name)
    println(executiceCustomer.balance)
}