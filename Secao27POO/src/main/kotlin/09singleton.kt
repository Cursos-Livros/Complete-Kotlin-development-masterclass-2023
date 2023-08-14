fun main() {
    if (DatabaseAccess.connected) {
        DatabaseAccess.disconnected()
    } else {
        DatabaseAccess.connect()
    }

    println("Database is connect: ${DatabaseAccess.connected}")
}

object DatabaseAccess {
    var connected = false
    fun connect() {
        connected = true
        println("Connected to Database!")
    }

    fun disconnected() {
        connected = true
        println("Disconnected to Database!")
    }
}