fun main(args: Array<String>) {
//               Sobre Operações
//    ┌────────────┐        ┌────────────┐
//    │  Resultado │        │   Tamanho  │
//    │  Operacao  ├───────►│   maior    │
//    │            │        │   tipo     │
//    └────────────┘        └────────────┘
// Byte>Short>Int>Long>Float>Double

    val vacas = 3
    val produzLeite = true
    var filhos = 2
    val financiamento = (vacas < 5 && produzLeite || filhos >= 3)

    println("$financiamento")

}