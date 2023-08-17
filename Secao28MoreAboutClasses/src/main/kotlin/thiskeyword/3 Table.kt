package thiskeyword

fun main() {
    val table = Table()

    table.printTable()
    table.updateTable(90.0, 600.0)
    table.printTable()
}

class Table {
    var height: Double = 0.0
    var size: Double = 0.0

    fun updateTable(newHeight: Double, newSize: Double) {
        this.height = newHeight
        this.size = newSize
    }

    fun printTable() {
        println("The table has $height cm and $size cm")
    }
}