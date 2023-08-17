package highorderfunction

fun main() {
    val names = arrayListOf("Alice", "Bob", "Carol", "Dan")
    val myLambda = {name:String -> println("Hello there $name") }
    sayHello(names, myLambda)
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}