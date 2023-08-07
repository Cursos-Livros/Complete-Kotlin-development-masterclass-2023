fun main() {
    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept", 2345)

    println(attendance)

    var people25 = attendance["25 Sept"] ?: 0
    var people26 = attendance["26 Sept"] ?: 0
    var sum = people25 + people26

    println("$sum")
    println("Tem dia 22 disponível? ${attendance.contains("22 Sept")}")

    val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
    println("Sum of two matrices is: ")
    for (row in firstMatrix) {
        for (column in firstMatrix) {
            print(firstMatrix)
        }
        println()
    }


}