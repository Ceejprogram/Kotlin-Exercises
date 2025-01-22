package com.example.firstkotlin

fun main(){
    print("Type something to reverse: ")
    val input = readLine()?:""
    val reverse = input.reversed()
    println("Reversed Result: $reverse")
}