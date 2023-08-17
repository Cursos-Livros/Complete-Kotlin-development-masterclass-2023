package companionobject

fun main() {
    println(Car.providerDrivingInstructions())
}
class Car {
    companion object {
        fun providerDrivingInstructions(): String {
            return "Drive Safe!"
        }
    }
}