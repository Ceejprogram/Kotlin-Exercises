package com.example.firstkotlin

fun main() {

    print("Enter Radius: ")
    val radius = readLine()?.toDoubleOrNull()

    if (radius != null && radius >= 0.0) {
        var area = Math.PI * Math.pow(radius, 2.0)
        var perimeter = 2 * Math.PI * radius

        println("\nIf the radius of Circle is $radius")
        println("Area: %.2f".format(area))
        println("Perimeter: %.2f".format(perimeter))
    } else {
        println("Error: Invalid Radius")
    }
}