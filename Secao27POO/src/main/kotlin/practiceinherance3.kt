fun main() {
    val doctor = Doctor()
    val engineer = Engineer()

    println("Doctor")
    doctor.name = "Tony Tony Chopper"
    doctor.salary = 15.000
    doctor.work()
    println("The doctor here is ${doctor.name}")

    println("Engineer")
    engineer.name = "Frank"
    engineer.salary = 16.000
    doctor.study()
    println("The engineer here is ${engineer.name}")
}

open class Job {
    var name: String = "Generic Job"
    var revenue: Double = 0.0
    var salary: Double = 10.000

    fun work() {
        revenue += salary
        println("$name revenue $revenue")
    }

    fun study() {
        salary += 5000
        println("$salary salary $salary")
    }
}

class Doctor: Job()

class Engineer: Job()