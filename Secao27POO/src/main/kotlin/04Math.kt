fun main() {
    var operation = Math()

    operation.sum(4, 2)
    operation.sub(5, 2)
    operation.mul(6, 3)
    operation.div(10, 5)

    println("Sum Operation: ${operation.differentAdd(3, 3)}")
}

class Math {

    fun differentAdd(number1: Int, number2: Int) = number1 + number2
    fun sum(number1: Int, number2: Int) {
        println("${number1 + number2}")
    }

    fun sub(number1: Int, number2: Int) {
        println("${number1 - number2}")
    }

    fun mul(number1: Int, number2: Int) {
        println("${number1 * number2}")
    }

    fun div(number1: Int, number2: Int) {
        println("${number1 / number2}")
    }
}

class `5` {
}