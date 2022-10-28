package com.phw.kotlinpractice

fun main() {
    ignoreNulls("HI")
}

// 1. 함수
fun helloWorld() : Unit { // Unit = Void 같다고 보면됨. Unit 생략해도 됨
    println("Hello World!")
}

fun add(a: Int, b: Int) : Int { // Swift: func add(a: Int, b: Int) -> Int
    return a + b
}

// 2. val vs var
fun hi () {
    val a: Int = 10 // 변하지 않는 값. Swift의 let과 같다고 보면 됨
    var b: Int = 9

    var name = "Harry" // String으로 타입 추론 가능함
}

// 3. String template
fun stringTemplate() {
    val name = "Harry"
    val lastName = "Park"
    println("my name is ${name + lastName}.") // $변수 또는 ${변수}로 사용

    println("is this true? ${1==0}")

    println("this is 2\$a") // this is 2$a 출력

    /*
    여러줄 주석
     */
}

// 4. 조건식
fun maxBy(a: Int, b: Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if(a > b) a else b

fun checkNum(score: Int) {
    // switch와 비슷함
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("idk")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when(score) {
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement
// 코틀린의 모든 함수는 Expression임
// 명령을 지시하는 건 Statement

// 5. Array and List

// Array

// List, MutableList

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "b", 3.4f)
    val list2 = listOf(1, "b", 11L)

    array[0] = 3 // 특정 행 값 변경 가능
//    list[0] = 2 // 변경 불가능

    println(array[0])

    var result = list.get(0) // List는 가져오기만 가능
    println(result)

    // MutableList
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

    println(arrayList)
}

// 6. For / While
fun forAndWhile() {
    val students = arrayListOf("Harry", "Laura", "Lowell")

    for (name in students) { // Swift: for name in students
        println(name)
    }

    var sum = 0
    for (i in 1..10 step 2) { // 1, 3, 5, 7, 9 // downTo도 있음 역순, until은 10 미만
        sum += i
    }

    println(sum)

    for ((index, name) in students.withIndex()) { // Swift: for (index, element) in students.enumerated()
        println("${index + 1}번째 학생: ${name}")
    }

    var index = 0
    while (index < 10) {
        println("current index: ${index}")
        index++
    }
}

// 7. Nullable / NonNull
fun nullCheck() {
    // NPE: Null Pointer Exception

    var name: String = "Harry"
    var nullName: String? = null // Swift의 옵셔널과 동일

    var nameInUpperCase = name.toUpperCase()
    println(nameInUpperCase)

    var nullNameInUpperCase = nullName?.toUpperCase()
    println(nullNameInUpperCase)

    // ?: (default 값 설정. Swift의 ??과 동일)

    val lastName: String? = null
    val fullName = name + " " + (lastName?: "No lastName")

    println(fullName)
}

fun ignoreNulls(str: String?) {
    // !! (Swift의 str!과 동일)
    val mNotNull: String = str!!
    val upper = mNotNull.toUpperCase()

    val email: String? = "hw@e-no.tv"
    email?.let { //email이 null이 아닐 때 처리. Swift의 if let과 비슷함
        println("my email is ${email}")
    }
}