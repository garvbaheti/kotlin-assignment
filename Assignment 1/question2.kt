package com.example.kotlinassignment

import java.util.*

fun bill(reading:Float,hours:Float):Float{
    var bill : Float
    var units : Float = reading*hours*30

    if(units>501){
        bill = (400+(7.95*units)).toFloat()
    }
    else if(units in 301.0..500.0){
        bill = (345+(7.65*units)).toFloat()
    }
    else if(units in 151.0..300.0){
        bill = (275+(7.35*units)).toFloat()
    }
    else if(units in 51.0..150.0){
        bill = (230+(6.5*units)).toFloat()
    }
    else if(units in 1.0..50.0){
        bill = (230+(4.5*units)).toFloat()
    }
    else{
        bill = 0F
    }
    return bill
}

fun main(){
    var reader = Scanner(System.`in`)

    print("Enter Meter Reading in KW: ")
    var reading:Float = reader.nextFloat()

    print("Enter Hours: ")
    var hours:Float = reader.nextFloat()

    var finalBill : Float = bill(reading,hours)
    println("\nBill Generated $finalBill")
}