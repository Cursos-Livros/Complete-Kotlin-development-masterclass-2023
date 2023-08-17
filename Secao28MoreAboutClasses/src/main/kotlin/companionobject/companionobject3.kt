package companionobject

import kotlin.random.Random

fun main() {
    val correctKey = Lock.createKey() // Correct Key receive the value of key
    val myLock = Lock(correctKey) //the var myLock instantiate an object of the type lock with the constructor of type key
    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unlock(randomKey)
}

class Lock(key: Key) {
    val secretCode: String

    // Initiate with the secret code class lock
    // generating a new secret
    // and put this secret in the var of class key too
    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }


    companion object {
        fun createKey() = Key()
    }

    // Generate a new secret number and convert to string
    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    // Unlock if the number in secret code of class key and
    // secret code of class Lock be equals
    fun unlock(key: Key) {
        if (key.secretCode == secretCode) {
            println("Lock is Open")
        } else {
            println("Key is not correct")
        }
    }

}

class Key {
    var secretCode: String = ""
        set(value) {
            if (field == "") {
                field = value
            }
        }
}