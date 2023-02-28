package app

import data.Person

fun main() {
    val andry = Person()
    andry.firstName = "Andry"

    val joko = Person()
    joko.firstName = "Joko"

    val budi = Person()
    budi.firstName = "budi"

    println(andry.firstName)
    println(joko.firstName)
    println(budi.firstName)
}