package data

class Companny(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean{
        return when (other) {
            is Companny -> name == other.name
            else -> false
        }
    }
}