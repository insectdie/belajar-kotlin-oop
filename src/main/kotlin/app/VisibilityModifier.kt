package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Andry")
    println(teacher.name)

    teacher.test()
}