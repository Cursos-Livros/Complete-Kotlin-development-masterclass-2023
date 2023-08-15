fun main() {
    println("Enter Account name:")
    var accountNumber = readLine() ?: ""

    println("Enter Account name:")
    var accountName = readLine() ?: ""

    println("Is there initial deposit?")
    var initialDeposit: Char = readln().single()

    if (initialDeposit == 'C') {
        println("Is there initial deposit?")
        var initialDepositValue = readLine() ?: ""
    }
}

class Account() {
    val accountNumber: Int = 0
    var accountName: String? = null
    var balance: Double = 0.0
}