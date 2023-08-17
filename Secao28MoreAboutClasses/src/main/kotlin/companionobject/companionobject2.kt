package companionobject

fun main() {
 println(KotlinCourse.printInfomation())
}

class KotlinCourse {
    companion object {
        fun printInfomation(): String {
            return "The kotlin course i'm doing now is on Udemy and drive by Stephan Cavalinho"
        }
    }
}