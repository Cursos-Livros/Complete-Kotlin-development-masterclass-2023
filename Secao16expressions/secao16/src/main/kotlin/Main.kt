fun main(args: Array<String>) {
    // Expressions
    // Aritmética
    val teste = 2
    if (teste >= 3)
        println("Sim")
    else
        println("Nao")

    // Expressão in
    val petFavorito = "cat"
    val petDisponiveis = listOf("dog", "cat", "array")
    if (petFavorito in petDisponiveis) {
        println("Nos temos $petFavorito!")
    } else {
        println("Nos nao temos $petFavorito")
    }
    // Expressao !in not in
    val petSuspeito = "cachorro"
    val petSuspeitosDisponiveis = listOf("Boi", "vaca", "passarinho")
    if (petSuspeito !in petSuspeitosDisponiveis) {
        println("O $petSuspeito deve ser liberado")
    } else {
        println("prendam o $petSuspeito")
    }

    //Boolean returns retorna boolean se a funcao for capaz
    val animais = arrayListOf<String>()
    if (animais.isEmpty()) {
        animais.add("Alloy")
    }
    println(animais)

    // Prática
    println("Digite o nome do gato:")
    var convidado = readLine() ?: "Livre"
    var listaConvidado = listOf("Abby", "Alloy")

    if (convidado !in listaConvidado) {
        println("Convidado nao liberado")
    } else {
        println("Convidado liberado")
    }

    val animaisAbrigo = arrayListOf("Puma", "Laranjao", "Duas cara", "Toquinho", "Cinzao")
    if (animais.isEmpty()) {
        println("Todos os gatinhos foram adotados")
    } else {
        println("Ainda nao foram adotados todos os gatinhos")
        println("$animaisAbrigo")
    }

    println("Digite sua idade:")
    val input = readLine() ?: "1"
    var idade = input.toInt()
    if (idade == 0) idade = 1

    if (idade in (1..13)) {
        println("Crianca")
    } else if (idade in 14..18) {
        println("Adolescente")
    } else {
        println("Adulto")
    }


}