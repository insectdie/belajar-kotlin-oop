package app

import data.Companny

fun main() {
    val company1 = Companny("Andry")
    val company2 = Companny("Andry")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1 == company2)
}