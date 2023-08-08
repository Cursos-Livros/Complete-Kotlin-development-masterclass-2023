fun main(args: Array<String>) {
    //If statement padrao
    println("Por favor digite a quantidade do deposito")
    val input = readLine() ?: ""
    var saldoCliente = input.toInt()
    val price = 50
    var produtoClients = 0

    if (saldoCliente > price) {
        saldoCliente -= price
        produtoClients += 1
        println("Você comprou $produtoClients produtos")
        println("Você tem $saldoCliente reais")
    } else {
        println("Você nao tem dinheiro suficiente")
    }

    // Shorthand if 1 expressao nao precisa chaves
    val number = 25
    var par: String? = null
    if (number % 2 == 0)
        par = "Numero é par"
    else
        par = "Numero é impar"

    // Outra maneira em apenas uma linha
    val number2 = 25
    var par2: String? = null
    if (number % 2 == 0) par2 = "Numero é par" else par2 = "Numero é impar"

    // Atribuir uma expressao a uma variavel
    val number3 = 25
    var par3 = if (number % 2 == 0) "Numero é par" else "Numero é impar"

}