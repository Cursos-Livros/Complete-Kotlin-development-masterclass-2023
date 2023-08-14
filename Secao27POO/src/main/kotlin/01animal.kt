fun main() {
    val animal = Animal()
    animal.name = "Cat"
    animal.topSpeed = 50
    animal.run()
}

class Animal {
    var name: String? = null
    var topSpeed: Int? = null

    fun run() {
        println("$name Maximum speed $topSpeed")
    }
}