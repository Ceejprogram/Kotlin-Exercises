package com.example.firstkotlin

fun main() {

    // Sample arrays
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(6, 7, 8, 9, 10)

    // Array size checker
    if (array1.size != array2.size) {
        println("Error: Arrays must have the same size")
        return
    }

    // Array for result storage
    val result = IntArray(array1.size)

    // Multiplication logic
    for (i in result.indices) {
        result[i] = array1[i] * array2[i]
    }

    // Printing result
    println("Multiplication Results: ${result.joinToString(" ")}")
}