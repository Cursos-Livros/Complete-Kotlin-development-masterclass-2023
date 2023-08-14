fun main() {
    println("Enter the name of product:")
    val name = readLine() ?: ""
    println("Enter the price of product:")
    val price = readLine()?.toDouble() ?: 0.0
    println("Enter the quantity of products quantity on stock:")
    val quantityProduct = readLine()?.toInt() ?: 0


    // Secondary Constructor
    val product3 = Product3(name, price, quantityProduct)

    product3.printQuantity()

    println("Enter with the number of products to add in stock:")
    val quantity = readLine()?.toInt() ?: 0
    product3.addProducts(quantity)
    println("Update products quantity on stock: ${product3.quantity}")

    println("Enter with the number of products to remove in stock:")
    val quantityRemove = readLine()?.toInt() ?: 0
    product3.removeProduct(quantityRemove)
    println("Update product3s quantity on stock: ${product3.quantity}")

    product3.printQuantity()
}

class Product3 {
    var name: String? = null
    var price: Double = 0.0
    var quantity: Int = 0

    // Secondary Constructor Example
    constructor(name: String, price: Double, quantity: Int) {
        this.name = name
        this.price = price
        this.quantity = quantity
    }

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