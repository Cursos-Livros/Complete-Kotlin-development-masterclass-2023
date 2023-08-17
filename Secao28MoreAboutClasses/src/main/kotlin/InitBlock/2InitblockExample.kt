package InitBlock

fun main() {
    val myLaptop = Laptop()
    myLaptop.printStatus()
    myLaptop.onOff()
    myLaptop.printStatus()
}

class Laptop {
    var status = "Off"

    init {
        println("The laptop is turning $status")
    }

    fun onOff() {
        this.status = "On"
    }

    fun printStatus(){
        println("The laptop is now $status")
    }
}