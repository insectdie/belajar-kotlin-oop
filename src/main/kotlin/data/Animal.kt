package data

abstract class Animal {
    abstract val name : String
    abstract fun run()
}

class Dog : Animal() {
    override val name: String = "Dog"
    override fun run() {
        println("Dog Run")
    }
}
