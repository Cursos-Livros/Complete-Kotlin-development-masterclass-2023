fun main() {
    val produtos = hashMapOf(Pair("tenis", 29.99), Pair("meias", 5.99), Pair("jeans", 39.99))
    for (item in produtos.keys) {
        val precoFinal = addTaxa(produtos[item])
        println("$item custo $precoFinal")
    }
}

fun addTaxa(preco: Double?) = preco?.times(1.2)
