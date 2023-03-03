package app

import data.Handphone
import data.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is Handphone) {
        println("Hand Phone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")

        is Handphone -> println("Hand Phone with name ${any.name}")

        else -> println(any)
    }
}

fun printStringSafe(any : Any){
    val value : String? = any as? String
    println(value)
}

fun main() {

    printStringSafe("Andry")
    printStringSafe(1)

    printObjectWithWhen("Andry")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(Handphone("Samsung"))
}