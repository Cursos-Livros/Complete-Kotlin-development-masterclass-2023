import java.lang.Math

fun main() {
    val rectangle = Rectangle()
    println("Enter rectangle width and height")
    rectangle.width = readLine()?.toDouble() ?: 0.0
    rectangle.height = readLine()?.toDouble() ?: 0.0

    println("Area = ${rectangle.area()}")
    println("Perimeter = ${rectangle.perimeter()}")
    println("Diagonal = ${rectangle.diagonal()}")
}

class Rectangle {
    var width = 0.0
    var height = 0.0

    fun area(): Double {
        return width * height
    }

    fun perimeter(): Double {
        return (2 * width) + (2 * height)
    }

    fun diagonal(): Double {
        val pow = Math.pow(width, 2.0) + Math.pow(height, 2.0)
        return Math.sqrt(pow)
    }
}