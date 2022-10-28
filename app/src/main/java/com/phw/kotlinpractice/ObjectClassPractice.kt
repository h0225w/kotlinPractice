package com.phw.kotlinpractice

// Singleton Pattern
// 앱 실행 될 때 객체를 한 번만 생성함
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int): Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower: Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car) // Car(horsePower=10)
    println(car2) // Car(horsePower=200)
    println(CarFactory.cars.size.toString()) // 2
}