package com.example.helloworld

val input = intArrayOf(1,2,3,4,5,6,7,8,9,10)

fun main() {
    print(input.joinToString(", "))
    print("\n Consecutive monotonically increasing sequences:")
    findConsecutiveMonotonicallyIncreasingSequences(input)
    print("\nFirst maximum and second maximum:")
    findMax(input)
    print("\nRearranged array:")
    rearrangeArray(input)
}

fun findConsecutiveMonotonicallyIncreasingSequences(input: IntArray) {
    for (i in input.indices) {
        var temp = input[i]
        var k = i
        var sequence = "$temp"
        while (k < input.lastIndex && temp <= input[k + 1]) {
            sequence += (" " + (temp + 1))
            temp = input[++k]
        }
        if (k == input.lastIndex && sequence.split(" ").size >= 3) {
            print("\n$sequence")
        }
    }
}

fun findMax(input: IntArray) {
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    for (i in input) {
        if (i > max1) {
            max2 = max1
            max1 = i
        } else if (i > max2) {
            max2 = i
        }
    }
    print("\nFirst maximum: $max1\nSecond maximum: $max2")
}

fun rearrangeArray(input: IntArray) {
    var j = input.lastIndex
    for (i in input.indices) {
        if (i % 2 == 0 && input[i] % 2 == 1) {
            while (input[j] % 2 == 1) {
                j--
            }
            val temp = input[i]
            input[i] = input[j]
            input[j] = temp
        } else if (i % 2 == 1 && input[i] % 2 == 0) {
            while (input[j] % 2 == 0) {
                j--
            }
            val temp = input[i]
            input[i] = input[j]
            input[j] = temp
        }
    }
    print(input.joinToString(", "))
}