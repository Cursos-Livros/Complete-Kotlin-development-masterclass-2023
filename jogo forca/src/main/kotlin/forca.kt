import java.util.*
import kotlin.random.Random
import kotlin.system.exitProcess

val palavras = listOf("Naruto", "Sasuke", "Sakura", "Kakashi", "Itachi", "Jiraiya", "Tsunade", "Gaara", "Hinata", "Shikamaru")
var palavra = ""
val chutes = arrayListOf<Char>()
var chutesSobrando = 6
var erros = 0

fun main(args: Array<String>) {
    criaPalavra()
    geraPainel()
    printGameStatus()
    mostraPainel()
    calculaChutes()
    var gameOver = false

    do {
        var testaLetra = entraPalavra()
        var statusVazio = testaVazio(testaLetra)
        gameOver = statusVazio
        val letra = testaLetra[0].uppercaseChar()
        testaPalavra(letra)
        gameOver = verificaChuteRestante() || verificaEspacoSobrando()
    } while (!gameOver)
}

fun criaPalavra() {
    val indicePalavra = Random.nextInt(palavras.size)
    palavra = palavras[indicePalavra].uppercase(Locale.getDefault())
//    println(palavra)
}

fun geraPainel() {
    for (i in palavra.indices) {
        chutes.add('_')
    }
}

fun printGameStatus() {
    when (erros) {
        0 -> erro0()
        1 -> erro1()
        2 -> erro2()
        3 -> erro3()
        4 -> erro4()
        5 -> erro5()
    }
}

fun mostraPainel() {
    print("Palavra: ")
    for (letra in chutes) {
        print("$letra ")
    }
    println()
}

fun calculaChutes() {
    print("\nVocê tem $chutesSobrando chutes sobrando\n")
}


fun entraPalavra(): String {
    println("Por favor entre com uma letra")
    val input = readLine() ?: ""
    return input
}

fun testaPalavra(letra: Char) {
    if (palavra.contains(letra)) {
        for (i in palavra.indices) {
            if (palavra[i] == letra) {
                chutes[i] = letra
            }
        }
    } else {
        verificaChute()
        printGameStatus()
        calculaChutes()
    }
    mostraPainel()
}

fun testaVazio(testaLetra: String): Boolean {
    if (testaLetra.isEmpty()) {
        println("Você digitou Vazio. Digite novamente")
    }
    return false
}

fun verificaEspacoSobrando(): Boolean {
    if (!chutes.contains('_')) {
        println("Você acertou a Palavra!")
        return true
    }
    return false
}

fun verificaChute(): Int {
    println("Essa letra nao existe nessa palavra")
    chutesSobrando--
    erros++
    return erros
}

fun verificaChuteRestante(): Boolean {
    if (chutesSobrando == 0 || (erros - 1) > 5) {
        return vocePerdeu()
    }
    return false
}

fun vocePerdeu(): Boolean {
    println("Voce Perdeu!!!")
    return true
}


fun erro0() {
    println("  +---+")
    println("  |   |")
    println("      |")
    println("      |")
    println("      |")
    println("      |")
    println("      |")
    println("      |")
    println("=========")
}

fun erro1() {
    println("  +---+")
    println("  |   |")
    println("  0    |")
    println("      |")
    println("      |")
    println("      |")
    println("      |")
    println("      |")
    println("=========")
}

fun erro2() {
    println("  +---+")
    println("  |   |")
    println("  0    |")
    println("  |   |")
    println("  |   |")
    println("      |")
    println("      |")
    println("      |")
    println("=========")
}

fun erro3() {
    println("  +---+")
    println("  |   |")
    println("  0    |")
    println(" /|   |")
    println("  |   |")
    println("      |")
    println("      |")
    println("      |")
    println("=========")
}

fun erro4() {
    println("  +---+")
    println("  |   |")
    println("  0    |")
    println(" /|\\  |")
    println("  |   |")
    println("      |")
    println("      |")
    println("      |")
    println("=========")
}

fun erro5() {
    println("  +---+")
    println("  |   |")
    println("  0   |")
    println(" /|\\ |")
    println("  |   |")
    println(" / \\ |")
    println("      |")
    println("      |")
    println("=========")
}



