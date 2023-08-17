package InitBlock

fun main() {
    val homePage = Browser()
}

class Browser {
    val browserName: String = "Firefox"
    val homePage: String = "www.google.com"

    init{
        println("The $browserName is running and $homePage is running")
    }
}