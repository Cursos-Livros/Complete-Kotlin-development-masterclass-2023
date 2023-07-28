import java.util.*
// Const
const val URL_LINK = "google.com"

fun main(args: Array<String>) {
    //Strings cadeia de caracteres da posicao 0
    println("The aswear \"yes\" o")
    println("I like put a \\ in my code")
    //chars 'n'
    println('a')
    // Variaveis mutaveis e imutáveis
    var mutavel = 0
    val imutavel = 0
    //Exercise 1
    println("(\\(\\")
    println("(-.-)")
    println("o(\")(\")")

    // Funcoes
    val mypet = "Crocodile"
    println(mypet.length)
    // Reescrever com primeiro maiusculo
    val myName = "jose"
    println(myName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    // Trim - nao remove espaço meio
    val myText = "   Aqui   tem muito espaço     "
    println(myText.trim())

    //Get salvar o character de determinada posicao
    val myPet = "Alloy"
    println(myPet.get(3))
    println(myPet[3])
    //Substring pega uma subtring a partir de determinado indice
    println(myPet.substring(3))

    // String template concatenar string
    val myCatName = "Abby"
    println("$myCatName")
    println("${1 + 1}") // {} Necessárias expressao

    //Acessando const
    println("Acessando $URL_LINK")
}