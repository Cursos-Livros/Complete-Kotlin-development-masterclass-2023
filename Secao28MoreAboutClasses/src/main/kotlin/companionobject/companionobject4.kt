package companionobject

fun main() {
    val myBook = Book(Book.getEditor())
    println(myBook.editor.editorName)
}

class Book(val editor: Editor) {
    companion object {
        fun getEditor(): Editor {
            return Editor("O'Reilly")
        }
    }
}

class Editor(val editorName: String) {

}