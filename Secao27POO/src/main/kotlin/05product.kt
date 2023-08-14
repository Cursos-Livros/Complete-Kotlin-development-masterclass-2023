fun main() {
    val product = Product()
    println("Digite o nome do produto:")
    product.name = readLine() ?: ""
    println("Digite o preço do produto:")
    product.price = readLine()?.toDouble() ?: 0.0
    println("Digite a quantidade do produto em estoque:")
    product.quantity = readLine()?.toInt() ?: 0

    product.printQuantity()

    println("Enter with the number of products to add in stock:")
    val quantity = readLine()?.toInt() ?: 0
    product.addProducts(quantity)
    println("Update products quantity on stock: ${product.quantity}")

    println("Enter with the number of products to remove in stock:")
    val quantityRemove = readLine()?.toInt() ?: 0
    product.removeProduct(quantityRemove)
    println("Update products quantity on stock: ${product.quantity}")

    product.printQuantity()
}

class Product {
    var name: String? = null
    var price: Double = 0.0
    var quantity: Int = 0

    fun totalValueInStock(): Double {
        return price * quantity
    }

    fun addProducts(quantity: Int) {
        this.quantity += quantity
    }

    fun removeProduct(quantity: Int) {
        this.quantity -= quantity
    }

    fun printQuantity() {
        println("Product data: name ${name} , price ${price}, quantity  ${quantity}, total ${totalValueInStock()}")
    }

}