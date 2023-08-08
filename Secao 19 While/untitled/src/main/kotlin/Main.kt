fun main(args: Array<String>) {

    val usernames = hashSetOf<String>("john", "bob", "alice")
    var finalizou = true

    do {
        println("Digite o seu username:")
        val input = readLine() ?: ""
        if (usernames.contains(input)) {
            println("")
        } else {
            finalizou = false
            usernames.add(input)
        }
    } while (!finalizou)
}