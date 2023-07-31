fun main() {
//Overload
    val quadradoInteiro = quadrado(7)
    val quadradoDouble = quadrado(7.5)
    println("Quadrado inteiro 7 é: $quadradoInteiro")
    println("Quadrado double 7.5 é: $quadradoDouble")
}

fun quadrado(numero: Int): Int {
    println("Chamada da funcao com argumento int: $numero")
    return numero * numero
}

fun quadrado(numeroDouble: Double): Double {
    println("Chamada da funcao com argumento double: $numeroDouble")
    return numeroDouble * numeroDouble
}