package com.example.firstkotlin

fun main() {

    // Enter 3 numbers
    print("Enter first number: ")
    val num1 = readLine()?.toIntOrNull()
    print("Enter second number: ")
    val num2 = readLine()?.toIntOrNull()
    print("Enter third number: ")
    val num3 = readLine()?.toIntOrNull()

    // Check if there is an empty input
    if (num1 != null && num2 != null && num3 != null) {
        // Determine the greatest number
        val greatest = maxOf(num1, num2, num3)
        // Print the greatest number
        println("The greatest number is: $greatest")
    } else {
        println("Error: Please enter a number!")
    }
}