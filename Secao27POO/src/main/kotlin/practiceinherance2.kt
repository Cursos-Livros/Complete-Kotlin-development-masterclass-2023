fun main() {
    val myBoeing = Boeing()
    val myAirBus = AirBus()

    println("Boeing")
    myBoeing.name = "737"
    myBoeing.speed = 800.0
    myBoeing.ascend()
    println("My ${myBoeing.name} at this moment it's ${myBoeing.speed} Km/h and ${myBoeing.altitude} meters on air")

    println("AirBus")
    myAirBus.name = "A320"
    myAirBus.speed = 1200.0
    myAirBus.descend()
    println("My ${myAirBus.name} at this moment it's ${myAirBus.speed} Km/h and ${myAirBus.altitude} meters on air")
}

open class AirPlane {
    var name: String = "Generic Airplane"
    var speed: Double = 0.0
    var altitude: Double = 20000.00

    fun ascend() {
        altitude += 1000
    }

    fun descend() {
        altitude -= 1000
    }
}

class Boeing : AirPlane()

class AirBus : AirPlane()