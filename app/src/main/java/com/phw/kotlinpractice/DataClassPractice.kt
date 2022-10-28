package com.phw.kotlinpractice

data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)

// toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("koreanAir", "harry", "2022-10-28", 19)

    println(ticketA) // Ticket(companyName=koreanAir, name=harry, date=2022-10-28, seatNumber=19)
}