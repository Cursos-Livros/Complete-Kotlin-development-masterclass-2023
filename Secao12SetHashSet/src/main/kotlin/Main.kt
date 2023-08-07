fun main(args: Array<String>) {
    // Set
    val numeros = setOf(6, 34, 6, 42)
    println(numeros)

    val numeros2 = setOf<Int>()
    println(numeros2)

    val numeros3 = setOf(1, 8, 3, null, 5, 2, null)
    println(numeros3)

    //Funcões Set
    //Retain elementos que estao em uma mas que nao estao na outra

    //Hashset
    val numeros4 = hashSetOf(3, 7, 5, null)
    println(numeros4)

    val numeros5 = hashSetOf<Int>()
    println(numeros5)

    // Add
    numeros4.add(33)
    println(numeros4)

    val novosNumeros = hashSetOf(56, 34, 78)
    numeros4.addAll(novosNumeros)
    println(novosNumeros)

    // Remove
    numeros4.remove(33)
    println(numeros4)

    numeros4.removeAll(novosNumeros)
    println(novosNumeros)

}