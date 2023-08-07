fun main(args: Array<String>) {
    val digiescolhidos = mapOf(
        Pair(1, "Tai"), Pair(2, "Mat"), Pair(3, "Izzy"), Pair(4, "Sora"), Pair(5, "Mimi"), Pair(6, "Joe"), Pair(7, "Tk")
    )

    println(digiescolhidos[3])
    println(digiescolhidos.keys)
    println(digiescolhidos.values)

    val digimon = hashMapOf(
        Pair(1, "Agumon"), Pair(2, "Gabumon"), Pair(3, "Tentomon"), Pair(4, "Pyomon"), Pair(5, "Palmon"), Pair(6, "Gomamon"), Pair(7, "Patamon")
    )

    digimon[6] = "Ikkakumon"
    digimon.put(6, "Zudramon") //all também

    digimon.remove(6)

    digimon.replace(7, "Angemon")
    println(digimon)
}