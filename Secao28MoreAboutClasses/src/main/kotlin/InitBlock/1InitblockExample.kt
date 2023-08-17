package InitBlock
fun main() {
    val myCar = Car()
}

class Car {
    val model = "no model"
    val topSpeed = 100

    init {
        println("This car is model $model and has top speed of $topSpeed")
    }
}