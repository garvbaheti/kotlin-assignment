package com.example.kotlinassignment

import java.util.*

fun isPrime(num:Int):Boolean{
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

    print("Enter Number: ")
    var num:Int = reader.nextInt()
    if(isPrime(num)) {
        println("$num is Prime")
    }
    else{
        print("$num is not Prime")
    }
}