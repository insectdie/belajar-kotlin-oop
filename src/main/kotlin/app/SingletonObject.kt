package app

import data.Aplication
import data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Andry"))
    a()
    b()

    println(Aplication.Companion.toUpper("Andry"))
    println(Aplication.toUpper("Andry"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}