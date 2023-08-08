fun main(args: Array<String>) {

    // Null
    val seuNome: String = "Olga"
    val meuNome: String? = null
    println(seuNome)
    println(meuNome)
    // Váriaveis nao nulas nao podem ser reassociadas
    var nomeGato: String = "Abby"
    //nomeGato = null //NullException
    var nomeGato2: String? = "Alloy"
    nomeGato2 = null

    //NullSafeCalls - Para chamadas nulas
    var seuCachorro: String? = "Dororo"
    println(seuCachorro?.length)
    seuCachorro = null
    println(seuCachorro?.length)
    println(seuCachorro?.length?.toString())// encadeado

    // Aritmetica com valores nulos
    val soma: Int? = 10
    println(soma?.plus(3))

    val subtracao: Int? = 10
    println(subtracao?.minus(3))

    val multiplicacao: Int? = 10
    println(multiplicacao?.times(3))

    val divisao: Int? = 10
    println(divisao?.div(3))

    val restoModulo: Int? = 10
    println(restoModulo?.rem(3))

    // Pratica
    val string: String? = "Este é um teste de Null"
    println(string?.substring(3, 6))

    val nullAble: Double? = 10.0
    println(nullAble?.times(6)?.toFloat())

    val userName = readLine()
    println(userName?.length)

    val number = readLine() // Le strings
    val converted = number?.toFloat() // precisa converter
    val result = converted?.times(7.0) // ai pode realizar a operação
    println(result)

    //Operador Elvis ?:
    val meuCelular: String? = null
    println(meuCelular ?: "Deu ruim")
    println(meuCelular?.length) // nao precisa mais da chamada ?. após o uso do elvis

    //Acerção nao nulo, Non null assertion
    //val testeAssercao: String? = null
    //println(testeAssercao!!.length)

    //Pratica
    val input = readLine()
    val product = 29.99
    val quantidadeComprado = input?.toInt() ?: 3
    println("${product * quantidadeComprado}")
}