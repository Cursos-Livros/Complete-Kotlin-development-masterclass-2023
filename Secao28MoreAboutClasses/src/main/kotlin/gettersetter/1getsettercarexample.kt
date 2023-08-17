package gettersetter

fun main() {
    val myCar = WeirdCar()
    myCar.speed = 100
    println("My Car name: ${myCar.name}")
    println("My Car speed: ${myCar.speed}")
}

class WeirdCar {
    var name = ""
    var speed: Int = 0
        get() = 50
        set(value) {
            name = "High Speed car $value"
            field = value
        }
}