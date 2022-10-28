package com.phw.kotlinpractice

class Book private constructor( val id: Int, val name: String) {
    companion object BookFactory: IdProvider { // java의 static과 비슷
        override fun getId(): Int {
            return 333
        }

        var myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    val book = Book.BookFactory.create() // Book.create()와 동일
    var bookId = Book.getId()

    println("${bookId} ${book.name}")
}