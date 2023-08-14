fun main() {

    println("Enter the name of product:")
    val name = readLine() ?: ""
    println("Enter the price of product:")
    val price = readLine()?.toDouble() ?: 0.0
    println("Enter the quantity of products quantity on stock:")
    val quantityProduct = readLine()?.toInt() ?: 0

    //Primary Constructor
    val product2 = Product2(name, price, quantityProduct)

    product2.printQuantity()

    println("Enter with the number of products to add in stock:")
    val quantity = readLine()?.toInt() ?: 0
    product2.addProducts(quantity)
    println("Update products quantity on stock: ${product2.quantity}")

    println("Enter with the number of products to remove in stock:")
    val quantityRemove = readLine()?.toInt() ?: 0
    product2.removeProduct(quantityRemove)
    println("Update products quantity on stock: ${product2.quantity}")

    product2.printQuantity()
}

// Primary Constructor example
class Product2(var name: String, var price: Double, var quantity: Int) {

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