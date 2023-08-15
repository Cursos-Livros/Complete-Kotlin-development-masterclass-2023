fun main() {
    val account = Bank1()
    account.account = 300
    account.account = 400
    account.account = 100
}

class Bank1() {
    var account: Int = 0
        get() = field
        set(value) {
            if (value > account) {
                creditRating++
            } else {
                creditRating--
            }
            field = value
            println("New credit rating is ${creditRating}")
        }

    var creditRating = 0
}