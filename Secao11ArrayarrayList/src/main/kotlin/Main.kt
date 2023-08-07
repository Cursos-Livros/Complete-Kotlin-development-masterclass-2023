fun main(args: Array<String>) {
    //Lista
    println("Array")
    val pokemon = listOf("Red", "Blue", "Yellow")
    println(pokemon)

    //Lista vazia - tipo lista
    val pokemon2 = listOf<String>()
    println(pokemon2)

    //Elementos Duplicados
    val pokemon3 = listOf("Red", "Blue", "Yellow","Red", "Blue", "Yellow")
    println(pokemon3)

    //Null
    val pokemon4 = listOf("Red", "Blue", "Yellow", null)
    println(pokemon4)

    //Acessar elemento lista
    val pokemon5 = listOf("Red", "Blue", "Yellow", null)
    println(pokemon4[0])
    println(pokemon4.get(3))
    println(pokemon4.size)

    //Funcoes lista
    println("Tamanho lista ${pokemon.size}")
    println("Contem Ruby? ${pokemon.contains("Ruby")}")
    println("Contem todos os items da lista pokemon 2 ${pokemon.containsAll(pokemon2)}")
    println("Qual o indice da versao Blue? ${pokemon.indexOf("Blue")}")
    println("Qual o indice da ultima ocorrencia do Pokemon blue? ${pokemon.lastIndexOf("Blue")}")

    println()

    //Array List
    println("Array List")
    val digimons = arrayListOf("Agumon", "Gabumon", "Tentomon", "Pyomon", "Palmon", "Gomamon", "Patamon")
    println(digimons)

    val arrayListVazia = arrayListOf<String>()
    println(arrayListVazia)

    // Funcao Add
    digimons.add("Gatomon")
    println(digimons)

    // Add outro array list
    val digievolucao = arrayListOf("Greymon", "Garurumon", "Kabuterimon", "Birdramon", "Togemon", "Ikkakumon","Angemon")
    digimons.addAll(digievolucao)
    println(digimons)

    //Remove
//    digimons.removeAll(digievolucao)
//    println(digimons)
//
//    digimons.removeAt(0)
//    println(digimons)

    //Elementos duplicados
    //Removidos primeira ocorrencia

    //Funcoes array list
    println("O Agumon acaba de digivolver:  ${digimons.set(0,"Greymon")}")
    println(digimons)

    println("Quais sao os digmon da posicao 4 e 5:  ${digimons.subList(4,5)} ${digimons.subList(5,6)}")

    println("Metal Seadramon acabou de atacar")
    digimons.clear()
    println("Os digimons se separam de seus digiescolhidos?")
    println(digimons.isEmpty())
}