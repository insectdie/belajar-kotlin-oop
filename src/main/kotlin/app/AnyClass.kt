package app

import data.Smartphone

fun main() {
    val smartphone = Smartphone("Samsung S10", "Android")

    println(smartphone.toString())
    println(smartphone.hashCode())
}