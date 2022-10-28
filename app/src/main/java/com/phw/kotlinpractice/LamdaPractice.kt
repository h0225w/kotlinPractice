package com.phw.kotlinpractice

// 1. Lamda
// 우리가 마치 value 처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다
// 2) return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lamdaName: Type = {argumentList -> codeBody}

val square: (Int) -> (Int) = {number -> number * number}
val nameAge = {name: String, age: Int ->
    "my name is ${name} I'm ${age}"
}
fun main() {
    println(square(12))
    println(nameAge("Harry", 22))

    val a = "Harry said"
    println(a.pizzaIsGreat())

    println(extendString("Harry", 22))

    println(calculateGrade(44))

    val lamda = {number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({true}))
    println(invokeLamda({it > 2.3}))

    println(invokeLamda() { it > 3.2 })
}

// 확장함수
val pizzaIsGreat: String.() -> String = {
    this + " Pizza is the best !!"
}

fun extendString(name: String, age: Int) : String {
    val introduceMyself: String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 return
val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
// Swift의 클로저와 비슷하게 사용
fun invokeLamda(lamda: (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}