fun main() {
    //Exericio1
    println("Digite o 1 numero")
    val input = readLine() ?: "0"
    val numero1 = input.toInt()

    println("Digite o 2 numero")
    val input2 = readLine() ?: "0"
    val numero2 = input2.toInt()
    val soma = soma(numero1, numero2)
    println("O resultado é: $soma")
}

fun soma(numero1: Int, numero2: Int): Int {
    return numero1 * numero2
}