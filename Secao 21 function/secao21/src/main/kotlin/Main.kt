import sun.plugin2.message.Message

fun main(args: Array<String>) {
//    // Prática
//    printMessage()
//
//    for (i in 1..3) {
//        multiplica17()
//    }
//
//    for (j in 1..3) {
//        usuarioAniversario()
//    }
//
//    // Exemplo parametros
//    double(2)
//
//    // Exemplo Collections
//    val gatos = listOf("Gatinha", "Abby", "Alloy")
//    falaMiau(gatos)

    // Default parametro
    doubleMessage(2, "5 * 2 = ")

}

fun printMessage() {
    for (i in 1..10) {
        println("Mensagem $i")
    }
}

fun multiplica17() {
    println("Digite um numero")
    val input = readLine() ?: "0"
    val numero = input.toInt()

    println("${numero * 17}")
}

fun usuarioAniversario() {
    println("Digite seu nome")
    val input = readLine() ?: "usuário"
    val usuario = input

    println("Digite um numero")
    val input2 = readLine() ?: "2000"
    val aniversario = input2.toInt()

    println(usuario)
    println(2023 - aniversario)
}

fun double(number: Int) {
    println("Double $number is ${number * 2}")
}

fun falaMiau(gatos: Collection<String>) {
    for (gatas in gatos) {
        println(gatas)
    }
}

fun doubleMessage(numero: Int, message: String = " Dobro é") {
    println("$message ${numero * 2}")
}