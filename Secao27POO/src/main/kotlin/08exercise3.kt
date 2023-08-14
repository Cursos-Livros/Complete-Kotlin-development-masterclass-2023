fun main() {
    val student = Student()

    println("Enter the name of student")
    student.name = readLine() ?: ""

    println("enter grade of the first semester the of student")
    student.grade1 = readLine()?.toDouble() ?: 0.0

    println("enter grade of the second semester the of student")
    student.grade2 = readLine()?.toDouble() ?: 0.0

    println("enter grade of the trimester semester the of student")
    student.grade3 = readLine()?.toDouble() ?: 0.0

    println("${student.name}")

    println("FINAL GRADE: ${student.finalGrade()}")

    if (student.finalGrade() >= 60.0) {
        println("PASS")
    } else {
        println("FAILED")
        println("It's missing ${student.missingPoints()} Points")
    }
}

class Student {
    var name: String? = null
    var grade1: Double = 0.0
    var grade2: Double = 0.0
    var grade3: Double = 0.0

    fun finalGrade(): Double {
        return grade1 + grade2 + grade3
    }

    fun missingPoints(): Double {
        return if (finalGrade() < 60) {
            60.0 - finalGrade()
        } else {
            0.0
        }
    }
}
