fun main() {
    var zeJetpack = jetpack()
    zeJetpack.burn(10)

    println("The user is on ${zeJetpack.userHeight} meters")
}

class jetpack {
    var userHeight = 0

    fun burn(seconds: Int) {
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        userHeight -= 3 * seconds
        if (userHeight < 0) {
            userHeight = 0
        }
    }

}

class `5bankaccount` {
}