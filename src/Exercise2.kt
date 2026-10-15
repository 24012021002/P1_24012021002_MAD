open class Product(
    var productName: String,
    var quantity: Int,
    var amountPerQuantity: Double
) {
    constructor(productName: String, quantity: Int) : this(productName, quantity, 50000.0)

    constructor(productName: String) : this(productName, 1, 45000.0)

    open fun displayProductInfo() {
        println("Product Name: $productName")
        println("Quantity: $quantity")
        println("Amount per Quantity: Rs. $amountPerQuantity")
        println("Total Amount: Rs. ${quantity * amountPerQuantity}")
    }
}

class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Double,
    var cpuName: String,
    var ramSize: String,
    var hddSize: String
) : Product(productName, quantity, amountPerQuantity) {

    constructor(
        productName: String,
        cpuName: String,
        ramSize: String,
        hddSize: String
    ) : this(productName, 1, 55000.0, cpuName, ramSize, hddSize)

    override fun displayProductInfo() {
        super.displayProductInfo()
        println("CPU Name: $cpuName")
        println("RAM Size: $ramSize")
        println("HDD/SSD Size: $hddSize")
        println("-----------------------------------------")
    }
}

fun main() {
    val laptops = ArrayList<Laptop>()

    laptops.add(Laptop("Dell Inspiron 15", 2, 62000.0, "Intel Core i5 13th Gen", "16GB", "512GB SSD"))
    laptops.add(Laptop("HP Pavilion", 1, 68000.0, "AMD Ryzen 7 5800U", "16GB", "1TB SSD"))
    laptops.add(Laptop("Lenovo ThinkPad E14", 3, 75000.0, "Intel Core i7 12th Gen", "16GB", "512GB SSD"))
    laptops.add(Laptop("ASUS Vivobook 16", "Intel Core i5 12th Gen", "8GB", "512GB SSD"))
    laptops.add(Laptop("Apple MacBook Air", 1, 95000.0, "Apple M2", "8GB", "256GB SSD"))

    println("========== List of 5 Laptops ==========")
    for ((index, laptop) in laptops.withIndex()) {
        println("Laptop #${index + 1}:")
        laptop.displayProductInfo()
    }
}
