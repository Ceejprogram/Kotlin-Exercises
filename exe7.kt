package com.example.firstkotlin

fun main() {

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var odd = 0
    var even = 0

    for (numbers in array) {
        if (numbers % 2 == 0) {
            even++
        } else {
            odd++
        }
    }
    println("Total of even numbers: $even")
    println("Total of odd numbers: $odd")
}