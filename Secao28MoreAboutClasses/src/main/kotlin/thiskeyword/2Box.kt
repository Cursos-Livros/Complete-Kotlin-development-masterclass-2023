package thiskeyword

fun main() {
    val myBox = Box()

    myBox.printContent()
    myBox.updateContents("Naruto Mangá")
    myBox.printContent()
}
class Box {
    var contents: String = "Nothing"

    fun updateContents(newContents: String){
        this.contents = newContents
    }

    fun printContent(){
        println("Content is " + this.contents)
    }
}