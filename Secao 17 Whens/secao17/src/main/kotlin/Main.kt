fun main(args: Array<String>) {
    // When
    var animal = "Crocodilo"
    var acao: String = ""
    when (animal) {
        "cat" -> {
            acao = "Da pra ser pet"
        }

        "Crocodilo" -> {
            acao = "Nao da pra ser pet"
        }

        else -> {
            acao = "De um Google"
        }
    }
    println(acao)

    //When expressao nao necessário {} se a linha é de uma expressao
    var animal2 = "Crocodilo"
    var acao2: String = when (animal2) {
        "cat" -> "Da pra ser pet"
        "Crocodilo" -> "Nao da pra ser pet"
        else -> "De um Google"
    }
    println(acao2)

    // Outra maneira
    val month = "January"
    val dias = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println(dias)

    //Capturar valor direto no bloco When
    val name = "Olga"
    when (val length = name.length) {
        in 1..5 -> println("É a Olga")
        in 6..10 -> println("Nao é a Olga")
        else -> println("Quem é você")
    }

    //Pratica
    println("Digite seu Nome")
    val name2 = readLine() ?: ""
    when (name[2]) {
        'A', 'B', 'C' -> println("Ola $name bem vindo")
        in 'D'..'F' -> println("Ola $name como você vai")
        else -> println("Hi")
    }
}