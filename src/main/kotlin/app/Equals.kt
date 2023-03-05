package app

import data.Companny

fun main() {
    val company1 = Companny("Andry")
    val company2 = Companny("Andry")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}