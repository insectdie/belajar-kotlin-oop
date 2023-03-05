package data

class Cat: Animal() {
    override val name: String = "Cat"
    override fun run() {
        println("Cat run")
    }
}