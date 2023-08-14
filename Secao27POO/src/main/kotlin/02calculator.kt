fun main() {
    var operations = calculator()

    println("Simple Calculator")
    println("Sum: 1 + 1 =  ${operations.sum(1.0,1.0)}")
    println("Sub: 1 - 1 =  ${operations.sub(1.0,1.0)}")
    println("Sub: 1 * 1 =  ${operations.mul(1.0,1.0)}")
    println("Sub: 1 / 1 =  ${operations.div(1.0,1.0)}")
    println("Value on the total: ${operations.total}")
    operations.reset()
    println("Reseted calulator = ${operations.total}")
}
class calculator {
    var total: Double? = null

    fun reset() {
        total = 0.0
    }

    fun sum(number1: Double, number2: Double) {
        total = number1 + number2
    }

    fun sub(number1: Double, number2: Double) {
        total = number1 - number2
    }

    fun mul(number1: Double, number2: Double) {
        total = number1 * number2
    }

    fun div(number1: Double, number2: Double) {
        total = number1 / number2
    }
}