package com.example.firstkotlin

fun main() {

    print("Enter set of strings: ")
    val input = readLine()

    if (input != null) {
        var letters = 0
        var spaces = 0
        var numbers = 0
        var others = 0

        for (char in input) {
            when {
                char.isLetter() -> letters++
                char.isDigit() -> numbers++
                char.isWhitespace() -> spaces++
                else -> others++
            }
        }
        println("Characters Counter Machine")
        println("Letters: $letters")
        println("Spcaes: $spaces")
        println("Numbers: $numbers")
        println("Others: $others")

    } else {
        println("Error: Invalid Input")
    }
}