class Car(
    var type: String,
    var model: String,
    var price: Double,
    var owner: String,
    var milesDriven: Int
) {
    init {
        println("Object of class is created and Init is called.")
    }

    constructor(type: String, model: String, price: Double, owner: String) : this(type, model, price, owner, 0)

    fun getCarInformation(): String {
        return "Car Information: $type, $model\nCar Owner: $owner\nMiles Driven: $milesDriven\nOriginal Car Price: $price, Current Car Price: ${getCurrentCarPrice()}"
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentCarPrice(): Double {
        val depreciation = milesDriven * 5.0
        return if (price - depreciation > 0) price - depreciation else 0.0
    }

    fun displayCarInfo() {
        println("----------")
        println(getCarInformation())
        println("----------\n")
    }
}

fun main() {
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", "2018", 100000.0, "Aman", 105)
    car1.displayCarInfo()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", "2019", 400000.0, "Karan", 20)
    car2.displayCarInfo()

    println("******* ArrayList of Car **************")
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", "2017", 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", "2020", 4000000.0, "NPP", 200))

    for (car in carList) {
        car.displayCarInfo()
    }
}
