package com.example.firstkotlin

fun main() {

    print("Enter first number: ")
    var num1 = readLine()?.toIntOrNull()
    print("Enter second number: ")
    var num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {

        var (sNum1, sNum2) = num2 to num1

        println("\nSwapping Variables")
        println("new first number: $sNum1")
        println("new second number: $sNum2")

    } else {
        println("Error: Invalid Integers")
    }
}