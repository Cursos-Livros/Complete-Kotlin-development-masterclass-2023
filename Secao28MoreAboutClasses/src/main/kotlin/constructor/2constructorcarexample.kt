package constructor

fun main() {
    val myCar = Car2()
    val yourCar = Car2("HB20")
    val thisCar = Car2("Peugeot 208",200)

    println("My car ${myCar.model} and speed ${myCar.topSpeed} KM/h")
    println("Your car ${yourCar.model} and speed ${yourCar.topSpeed} KM/h")
    println("This car ${thisCar.model} and speed ${thisCar.topSpeed} KM/h")
}

class Car2 {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    var model: String? = null
    var topSpeed = 100
}