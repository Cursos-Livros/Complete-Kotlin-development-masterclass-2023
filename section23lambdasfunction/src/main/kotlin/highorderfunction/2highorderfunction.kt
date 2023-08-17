package highorderfunction

fun main() {
    val numbers = arrayListOf(3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers)
    val newNumber = update(numbers) { number -> number / 10 }
    println(newNumber)
}

fun update(numbers: ArrayList<Int>, lambda: (Int) -> Int): ArrayList<Int> {
    for (i in 0..numbers.size - 1) {
        if (numbers[i] % 2 == 0) {
            numbers[i] = lambda(numbers[i])
        }
    }
    return numbers
}