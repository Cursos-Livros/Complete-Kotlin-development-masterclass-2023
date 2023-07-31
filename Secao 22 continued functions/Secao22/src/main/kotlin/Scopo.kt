fun main() {
    var X = 1
    println("Variavel local X na funcao main $X")
    useVariavelLocal()
    useVariavelLocal()

    println("Local na funcao main é $X")
}

fun useVariavelLocal() {
    var X: Int = 25;
    println("Variavel local x dentro da funcao useVariavelLocal $X")
    X++
    println("Variavel local x depois do acrésimo da funcao useVariavelLocal $X")
}

