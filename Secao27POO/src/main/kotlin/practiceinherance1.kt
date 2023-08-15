fun main() {

    val myLaptop = Laptop()
    val myApple = Apple()

    myLaptop.screenSize = 10.0
    myLaptop.run()

    myApple.screenSize = 15.0
    myApple.name = "Apple Macbook"
    myApple.run()
}

open class Laptop {
    var name = "Generic Laptop"
    var screenSize: Double = 0.0
    val speed: Int = 1200

    fun run() {
        println("Running $name laptop with screen size $screenSize and speed $speed")
    }
}

class Apple : Laptop()