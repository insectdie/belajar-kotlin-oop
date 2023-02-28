package app

import data.User

fun main() {
    val user1 = User("andry", "secret")
    val user2 = User("joko", "secret")

    user1.username = "budi"
    user1.password = "Sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}