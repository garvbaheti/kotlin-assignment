package com.example.kotlinassignment

import java.util.*

fun isPerfectNumber(number: Int): Boolean {
    var temp = 0
    for (i in 1..number / 2) {
        if (number % i == 0) {
            temp += i
        }
    }
    return temp == number
}
fun main(){
    var reader = Scanner(System.`in`)

    print("Enter Number 1: ")
    var num1:Int = reader.nextInt()

    print("Enter Number 2: ")
    var num2:Int = reader.nextInt()

    for (i in num1 until num2 ){
        if(isPerfectNumber(i)) {
            println("$i ")
        }
    }
}