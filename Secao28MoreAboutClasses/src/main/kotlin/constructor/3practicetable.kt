package constructor

fun main() {
    val myTable = Table()
    val yourTable = Table("4 chairs",4)
    val thisTable = Table("6 chair",6, 20.0)

    println("The first table is ${myTable.name}")
    println("The second table is ${yourTable.name} and ${yourTable.legs} legs and height ${yourTable.height}")
    println("The third table is ${thisTable.name} and ${thisTable.legs} legs and height ${thisTable.height}")
}

class Table {
    constructor() {
        name = "No model"
    }

    constructor(newName: String, newLegs: Int) {
        name = newName
        legs = newLegs
    }

    constructor(newName: String, newLegs: Int, newHeight: Double) {
        name = newName
        legs = newLegs
        height = newHeight
    }

    var name: String? = null
    var legs: Int = 0
    var height: Double = 0.0
}