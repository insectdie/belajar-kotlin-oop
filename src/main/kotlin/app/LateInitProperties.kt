package app

import data.Televesion

fun main() {
    val tv = Televesion()
    tv.brand = "Samsung"
    tv.initTelevision("Test")
    println(tv.brand)
}