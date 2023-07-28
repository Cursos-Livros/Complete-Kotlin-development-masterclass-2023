import kotlin.random.Random

fun main(args: Array<String>) {
    println("Escreva algo")
    // Input Texto
    val input = readLine()
    // Input number conversao
    // Readline Retorna null ?:""
    val userInput = readLine() ?: " "
    println("Você escreveu: ${userInput.toInt()}")

    // Gerar numeros randomicos
    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30)) // Until - até menos

    // Inferencia
    var teste = 0 // implicito
    var teste2: Double = 0.0 // explicito

    // Descobrir tipo
    println(teste::class.java)

    //Declarar variavel explicita
    val testeLong: Long = 1L
    val testeDouble: Float = 2F

//Casts
//    ┌──────────────────────┐               ┌──────────────────────┐                    ┌──────────────────────┐
//    │                      │               │                      │                    │                      │
//    │  numero maior        │               │                      │                    │                      │
//    │  nao cabe no numero  │──────────────▷│      int > long      ├───────────────────▷│       Nao pode       │
//    │  menor               │               │                      │                    │                      │
//    │                      │               │                      │                    │                      │
//    └──────────────────────┘               └──────────────────────┘                    └──────────────────────┘
//
//    ┌───────────┐         ┌───────────┐
//    │           │         │           │
//    │ Conversão ├────────►│   Tipos   ├─
//    │           │         │           │
//    └───────────┘         └───────────┘

    var testeCast: Int = 0
    teste.toFloat() //Cast tem a palavra toantes

//    ┌───────────────┐     ┌───────────────┐     ┌───────────────┐
//    │               │     │               │     │               │
//    │   Qualquer    ├────►│   Convertida  ├────►│     String    │
//    │   variável    │     │               │     │               │
//    └───────────────┘     └───────────────┘     └───────────────┘

    var testeCastString = "15"
    testeCastString.toString() //saida cachorro


}