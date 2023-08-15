fun main() {
    val myDog = Viralata()
    myDog.size = 10
    println(myDog.size)
    myDog.bark()
    myDog.play()
}

open class Dog {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Viralata : Dog ()