package Assignment2

import java.util.*

fun insertionSort(input: Array<Int>): Array<Int> {
    for (j in 1 until input.size) {
        val key = input[j]
        var i = j - 1

        while (i >= 0 && input[i] > key) {
            input[i + 1] = input[i]
            i--
        }
        input[i + 1] = key
    }
    return input
}
fun descendingInsertionSort(input: Array<Int>): Array<Int> {
    for (j in 1 until input.size) {
        val key = input[j]
        var i = j - 1

        while (i >= 0 && input[i] < key) {
            input[i + 1] = input[i]
            i--
        }
        input[i + 1] = key
    }
    return input
}

fun main(){
    var reader = Scanner(System.`in`)

    print("Enter Size of Array 1: ")
    var array1size = reader.nextInt()
    var arr1 = Array(5) { _ -> 0 }
    for(i in 0 until array1size){
        print("Enter $i Number: ")
        arr1[i] = reader.nextInt()
    }
    println("Array 1 : "+arr1.contentToString())


    print("Enter Size of Array 1: ")
    var array2size = reader.nextInt()
    var arr2 = Array(5) { _ -> 0 }
    for(i in 0 until array1size){
        print("Enter $i Number: ")
        arr2[i] = reader.nextInt()
    }
    println("Array 2 : "+arr2.contentToString())

//    var arr1 = arrayOf(9,-9,88,6,5,3,1)
//    var arr2 = arrayOf(5,90,3,0,7,4,-90)

    var mergedArray = arr1+arr2

    var Sorted1 = insertionSort(arr1)
    println("Sorted Array 1 : "+Sorted1.contentToString())
    var Sorted2 = insertionSort(arr2)
    println("Sorted Array 2 : "+Sorted2.contentToString())
    println("Merged Sorted Array : "+ insertionSort(mergedArray).contentToString())
    println("Merged Reversed Sorted Array : "+ descendingInsertionSort(mergedArray).contentToString())

}