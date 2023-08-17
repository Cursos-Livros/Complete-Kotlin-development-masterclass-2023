package thiskeyword

fun main() {
    val note = PostItNote()
    println(note.message)

    note.updateMessage("Meeting at 10 with Alexis")
    println(note.message)
}

class PostItNote {
    var message: String = "No message"

    fun updateMessage (message:String){
        this.message = message
    }

    fun printMessage(){
        println(this.message)
    }
}