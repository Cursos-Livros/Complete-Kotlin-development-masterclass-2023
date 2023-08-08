fun main() {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    println("Itens em cima da mesa: $items")

    val removedItems = listOf("pen", "paper", "mug", "phone")

    items.removeAll(removedItems)

    println("Itens que sobraram na mesa: $items")
}