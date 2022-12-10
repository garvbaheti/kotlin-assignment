package com.example.kotlinassignment


import java.util.*

fun checkPrime(num:Int):Boolean{
    if(num<1){
        return false
    }
    for (i in 2 until num){
        if (num%i==0){
            return false
        }
    }
    return true
}

fun main(){
    var reader = Scanner(System.`in`)

    print("Enter Number 1: ")
    var num1:Int = reader.nextInt()

    print("Enter Number 2: ")
    var num2:Int = reader.nextInt()

    for (i in num1 until num2 ){
        if(isPrime(i)) {
            println("$i ")
        }
    }
}