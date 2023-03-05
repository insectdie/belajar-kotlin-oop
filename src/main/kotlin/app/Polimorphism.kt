package app

import data.Boss
import data.Employee
import data.Manager

fun main() {
    val employee: Employee = Employee("Andry")
    employee.sayHello("Budi")

    employee = Manager("Andry")
    employee.sayHello("Budi")
}