package com.phw.kotlinpractice

// 코틀린은 기본으로 final class기 때문에 open 해줘야함
open class Human constructor(val name: String = "Anonymous") { // constructor 생략 가능

    constructor(name: String, age: Int) : this(name) { // this -> 주 생성자 위임 받음
        println("my name is ${name}, ${age}years old.")
    }

    init {
        println("New human has been born !!")
    }

    fun eatingCake() {
        println("Yummyyyyyy~~~~~~")
    }

    open fun singASong() {
        println("lalala ~~")
    }
}

class Korean: Human() {
    // 오버라이딩
    override fun singASong() {
        super.singASong()
        println("라라라 ~~")
    }
}

fun main() {
//    val human = Human("Harry")
//    human.eatingCake()
//
//    val stranger = Human()

//    println("another human's name is ${stranger.name}")
//    println("this human's name is ${human.name}")

//    val mom = Human("Mother", 50)

    val korean = Korean()
    korean.singASong()
}