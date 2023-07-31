fun main() {
    val raio = 10
    val area = calculaAreaCirculo(raio)
    println("$area")

    val pessoa = listOf("Anna", "Beatrix", "William")
    for (alguem in pessoa) {
        val mensagem = boasVindasPersonalizada(alguem)
        println("$mensagem")
    }

    //Return Shorthand returno curto
    triplo(5)
}

fun calculaAreaCirculo(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

fun boasVindasPersonalizada(pessoa: String): String {
    val boasVindas = when (pessoa[0]) {
        'A' -> "Tudo bem $pessoa"
        'E' -> "E ai $pessoa"
        else -> "Ola $pessoa"
    }
    return boasVindas
}

fun triplo(triplo: Int) = 3 * triplo