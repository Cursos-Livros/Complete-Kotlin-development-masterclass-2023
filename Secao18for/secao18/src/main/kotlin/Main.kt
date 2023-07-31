fun main(args: Array<String>) {
    // For for each em uma coleçao
    var nomeGatos = arrayListOf<String>("Gatinha", "Abby", "Alloy", "Jampiro", "Merisca", "Puma", "Duas Cara", "Skin", "Durok", "Nina", "Tixa")
    for (nomeGatos in nomeGatos) {
        println("$nomeGatos")
    }

    // Pratica
    println("For")
    println("Digite um ano:")
    val input = readLine() ?: "2000"
    val ano = input.toInt()
    for (i in 1..12) {
        when (i) {
            1 -> println("Janeiro tem 31")
            2 -> if (ano % 4 == 0) println("Fevereiro tem 29 dias") else println("Fevereiro tem 28 dias")
            3 -> println("Março tem 31")
            4 -> println("Abril tem 30")
            5 -> println("Maio tem 31")
            6 -> println("Junho tem 30")
            7 -> println("Julho tem 31")
            8 -> println("Agosto tem 31")
            9 -> println("Setembro tem 31")
            10 -> println("Outubro tem 31")
            11 -> println("Novembro tem 31")
            12 -> println("Dezembro tem 31")
        }
    }

    // downTo maior pro menor
    println()
    println("Down to")
    for (j in 12 downTo 1) {
        when (j) {
            1 -> println("Janeiro tem 31")
            2 -> if (ano % 4 == 0) println("Fevereiro tem 29 dias") else println("Fevereiro tem 28 dias")
            3 -> println("Março tem 31")
            4 -> println("Abril tem 30")
            5 -> println("Maio tem 31")
            6 -> println("Junho tem 30")
            7 -> println("Julho tem 31")
            8 -> println("Agosto tem 31")
            9 -> println("Setembro tem 31")
            10 -> println("Outubro tem 31")
            11 -> println("Novembro tem 31")
            12 -> println("Dezembro tem 31")
        }
    }

    // Step
    println()
    println("step")
    for (j in 1..12 step 3) {
        when (j) {
            1 -> println("Janeiro tem 31")
            2 -> if (ano % 4 == 0) println("Fevereiro tem 29 dias") else println("Fevereiro tem 28 dias")
            3 -> println("Março tem 31")
            4 -> println("Abril tem 30")
            5 -> println("Maio tem 31")
            6 -> println("Junho tem 30")
            7 -> println("Julho tem 31")
            8 -> println("Agosto tem 31")
            9 -> println("Setembro tem 31")
            10 -> println("Outubro tem 31")
            11 -> println("Novembro tem 31")
            12 -> println("Dezembro tem 31")
        }
    }

    // Aninhamento
    val matriz = 10
    for (i in 0..3) {
        for (j in 0..3) {
            if (i == j) {
                print("Diagonal \t")
            } else {
                print("$i,$j \t\t")
            }
        }
        println()
    }

    //Prática
    val array = arrayListOf<String>("\uD83D\uDE00", "\uD83E\uDD28", "\uD83D\uDE31")
    println("Digite um numero")
    val input2 = readLine() ?: "0"
    val numero = input2.toInt()
    for (i in 0..numero) {
        for (j in 0..numero) {
            if ((i * j) % 3 == 0) {
                // print("$array[0]") Errado pois o indice fica como string entao ele nao sabe a posicao especifica e mostra o array inteiro
                print(array[0])
            } else if ((i * j) % 3 == 1) {
                print(array[1])
            } else {
                print(array[2])
            }
        }
        println()
    }
''
}

