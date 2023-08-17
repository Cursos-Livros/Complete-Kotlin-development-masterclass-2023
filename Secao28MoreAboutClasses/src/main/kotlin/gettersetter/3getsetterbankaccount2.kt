package gettersetter

fun main() {
    val account = BankAccount2()

    account.ammount = 500
    account.ammount = 1000
}

class BankAccount2 {
    var interestRate = 0.0
    var ammount: Int = 0
        get() = field
        set(value) {
            if (value < 1000) {
                interestRate = 1.0
            } else if (value < 10000) {
                interestRate = 0.5
            } else {
                interestRate = 0.2
            }
            field = value
            println("The client has $value and has interest rate of $interestRate")
        }
}