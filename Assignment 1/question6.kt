package com.example.kotlinassignment

import java.util.*

fun sumFactors(number: Int): Int {
    //Declare Mutable List to hold factors
    var sum : Int = 0

    //Find the factor of using loop
    for(i in 1..(number-1)){
        if(number%i==0){
            sum+=i
        }
    }
    return sum
}
fun printPair(num1:Int,num2:Int){
    var flag = false
    var sumN1: Int
    var N2: Int
    for (N1 in num1 until num2){
        sumN1 = sumFactors(N1)
        N2 = sumFactors(sumN1)
        if (N1==N2 && sumN1!=N1){
            if(N1<sumN1) {
                println("$N1 & $sumN1 ")
            }
            flag = true
        }
    }
    if (!flag){
        print("No Pair Found")
    }
}
fun main() {
    var reader = Scanner(System.`in`)

    print("Enter Number 1: ")
    var num1:Int = reader.nextInt()

    print("Enter Number 2: ")
    var num2:Int = reader.nextInt()
    printPair(num1,num2)
}