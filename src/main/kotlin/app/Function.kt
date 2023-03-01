package app

import data.Person

fun main() {
    val andry = Person()

    andry.firstName = "Andry"
    andry.middleName = "Halomoan"
    andry.lastName = "Ompusunggu"

    andry.sayHello("Budi")
    andry.run()

    val fullName = andry.getFullName()

    println(fullName)

}