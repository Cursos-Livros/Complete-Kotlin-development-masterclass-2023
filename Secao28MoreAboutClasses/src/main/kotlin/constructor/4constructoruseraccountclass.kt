package constructor

fun main() {
    val userNumber1 = Account()
    val userNumber2 = Account("Jose", 200.00)

}

class Account {
    constructor() {
        userName = "Generic User"
        balance = 1.0
        canAfford()
    }

    constructor(newUserName: String, newDeposit: Double) {
        userName = newUserName
        balance = newDeposit
        canAfford()
    }

    var userName: String = "User Name"
    var balance: Double = 0.0
    var tshirtPrice: Double = 20.0

    fun canAfford() {
        if (balance >= tshirtPrice) {
            println("$userName can afford ${balance / tshirtPrice} tshirts ")
        } else {
            println("$userName cannot afford ${balance / tshirtPrice} tshirts ")
        }
    }
}