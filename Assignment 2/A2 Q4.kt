package com.example.helloworld

import java.util.*

fun unique(array: Array<Int>, num:Int):Boolean{
    var flag:Boolean = true
    for(i in array.indices){
        if(num==array[i]){
            flag = false
        }
    }
    return flag
}

fun union(setA: Array<Int>,setB: Array<Int>):Array<Int>{
    var setC = Array(setA.size+setB.size) { _ -> 0 }
    var flag:Boolean = true
    for (i in setA.indices){
        setC[i]=setA[i]
    }
    for((k, j) in (setA.size until setC.size).withIndex()){
        setC[j]=setB[k]
        if(unique(setC,setB[k])){
            flag = false
        }
    }
    if(flag){
        println("Disjoint")
    }
    return setC
}

fun takeInput(set: Array<Int>):Array<Int>{
    var reader = Scanner(System.`in`)
    var i = 0
    while(i<set.size){
        println("Enter a Unique number for position $i: ")
        var x:Int = reader.nextInt()
        if(unique(set,x)){
            set[i]=x
            i++
        }
        else{
            println("Not a Unique Number")
            i=i
        }
    }
    return set
}
fun differenceSet(setA: Array<Int>, setB: Array<Int>): Array<Int> {
    var intSet:Array<Int> = setA.intersect(setB.toList().toSet()).toTypedArray()
    var diffSet:Array<Int> = Array(setA.size-intSet.size) { _ -> 0 }
    var k:Int=0
    for(i in setA.indices){
        if(unique(intSet,setA[i])){
            diffSet[k]=setA[i]
            k++
        }
    }
    return diffSet
}

fun printPowerSet(setA: Array<Int>) {
    var set:IntArray = setA.toIntArray()
    val n = set.size

    // Run a loop from 0 to 2^n
    for (i in 0 until (1 shl n)) {
        print("{ ")
        var m = 1 // m is used to check set bit in binary representation.
        // Print current subset
        for (j in 0 until n) {
            if (i and m > 0) {
                print(set[j].toString() + " ")
            }
            m = m shl 1
        }
        println("}")
    }
}

fun main() {
    var reader = Scanner(System.`in`)

    print("Enter Size of Set A: ")
    var size1 = reader.nextInt()
    var setA = Array(size1) { _ -> 0 }
    setA = takeInput(setA)

    print("Enter Size of Set B: ")
    var size2 = reader.nextInt()
    var setB = Array(size2) { _ -> 0 }
    setB = takeInput(setB)

    println("SetA : " + setA.contentToString())
    println("SetB : " + setB.contentToString())

    var setC = Array(size1 + size2) { _ -> 0 }
    setC = union(setA, setB)
    println("Union Set : " + setC.contentToString())

    var setD = differenceSet(setA, setB)
    println("Diff Set : " + setD.contentToString())

    println("Power set of Set A: ")
    printPowerSet(setA)
}