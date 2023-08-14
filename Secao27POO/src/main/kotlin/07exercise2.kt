fun main() {
    val employee = Employee()
    println("Enter the name of employee:")
    employee.name = readLine() ?: ""

    println("Enter the gross salary of employee:")
    employee.grossSalary = readLine()?.toDouble() ?: 0.0

    println("Enter the tax salary of employee:")
    employee.tax = readLine()?.toDouble() ?: 0.0

    employee.netSalary()

    println("Name:${employee.name}, $${employee.grossSalary}")

    println("Wich percentage to increase salary:")
    val increase = readLine()?.toInt() ?: 0

    employee.increaseSalary(increase)

    println("Name:${employee.name}, $${employee.grossSalary}")
}

class Employee {
    var name: String? = null
    var grossSalary: Double = 0.0
    var tax: Double = 0.0

    fun netSalary() {
        grossSalary -= tax
    }

    fun increaseSalary(percentage: Int) {
        grossSalary += ((grossSalary + tax) * percentage.toDouble() / 100)
    }
}