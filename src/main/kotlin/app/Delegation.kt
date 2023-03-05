package app

import data.Base
import data.MyBase
import data.MyBaseDelegation

fun main() {
    val base = MyBase()
    base.sayHello("Andry")

    val baseDelegation = MyBaseDelegation(base)
    baseDelegation.sayHello("Joko")
    baseDelegation.sayGoodbye("Budi")
}