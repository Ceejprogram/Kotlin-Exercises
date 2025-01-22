package com.example.firstkotlin

fun main() {

    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull()
    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        if (num2 != 0.0){
            var div = num1 / num2
            var remainder = num1 % num2

            println("\nDivision:")
            println("$num1 / $num2 = $div")
            println("Remainder:")
            println("$num1 % $num2 = $remainder")
        }else{
            println("Error: denominator must not be zero")
        }
    } else {
        println("Error: Invalid input")
    }
}