package com.example.kotlinassignment

import java.util.*

fun incometax(income:Float):Float{
    var tax : Float

    if(income>1000001){
        tax = (120000+(0.3*(income-1000000)*1.03)).toFloat()
    }
    else if(income in 500001.0..1000000.0){
        tax = (20000+(0.2*(income-500000)*1.03)).toFloat()
    }
    else if(income in 300001.0..500000.0){
        tax = (0.1*(income-300000)*1.03).toFloat()
    }
    else{
        tax = 0F
    }
    return tax
}
fun main(){
    var reader = Scanner(System.`in`)

    print("Enter Gross Income: ")
    var Income:Float = reader.nextFloat()

    print("Enter Exemption: ")
    var exemption : Float = reader.nextFloat()

    var taxableIncome:Float = Income - exemption
    var tax : Float = incometax(taxableIncome)
    var NetIncome : Float = taxableIncome - tax
    println("Exemptions : $exemption \nTaxable Income $taxableIncome \nNet Income: $NetIncome \nTax Deducted: $tax")
}