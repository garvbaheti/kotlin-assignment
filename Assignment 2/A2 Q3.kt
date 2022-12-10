package com.example.helloworld

fun transpose(M: Array<IntArray>): Array<IntArray> {
    val rows = M.size
    val cols = M[0].size
    return Array(cols) { col ->
        IntArray(rows) { row ->
            M[row][col]
        }
    }
}

fun isSymmetric(M: Array<IntArray>): Boolean {
    val rows = M.size
    val cols = M[0].size
    if (rows != cols) {
        return false
    }
    return (0 until rows).all { row ->
        (0 until cols).all { col ->
            M[row][col] == M[col][row]
        }
    }
}

fun isSkewSymmetric(M: Array<IntArray>): Boolean {
    val rows = M.size
    val cols = M[0].size
    if (rows != cols) {
        return false
    }
    return (0 until rows).all { row ->
        (0 until cols).all { col ->
            M[row][col] == -M[col][row]
        }
    }
}

fun addMatrices(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {
    val rows = A.size
    val cols = A[0].size
    return Array(rows) { row ->
        IntArray(cols) { col ->
            A[row][col] + B[row][col]
        }
    }
}

fun multiplyMatrices(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {
    val rows = A.size
    val cols = B[0].size
    val inner = A[0].size
    return Array(rows) { row ->
        IntArray(cols) { col ->
            (0 until inner).sumBy { j -> A[row][j] * B[j][col] }
        }
    }
}

fun main(args: Array<String>) {
    val arow1=intArrayOf(1,2,3)
    val arow2=intArrayOf(4,5,6)
    val arow3=intArrayOf(7,8,9)

    val a:Array<IntArray> = arrayOf(arow1,arow2,arow3)

    val brow1=intArrayOf(1,34,5)
    val brow2=intArrayOf(4,5,96)
    val brow3=intArrayOf(71,8,-10)

    val b:Array<IntArray> = arrayOf(brow1,brow2,brow3)

    println("Symmetric:${isSymmetric(a)}")
    println("Skew Symmetric:${isSkewSymmetric(a)}")

    val addition=addMatrices(a,b)
    println("After Addition:")
    println("${addition[0][0]},${addition[0][1]},${addition[0][2]}")
    println("${addition[1][0]},${addition[1][1]},${addition[1][2]}")
    println("${addition[2][0]},${addition[2][1]},${addition[2][2]}")

    var multipy=multiplyMatrices(a,b)
    println("After Multiplication:")
    println("${multipy[0][0]},${multipy[0][1]},${multipy[0][2]}")
    println("${multipy[1][0]},${multipy[1][1]},${multipy[1][2]}")
    println("${multipy[2][0]},${multipy[2][1]},${multipy[2][2]}")

    var transposeOfFirst=transpose(a)
    println("After Transpose of First")
    println("${transposeOfFirst[0][0]},${transposeOfFirst[0][1]},${transposeOfFirst[0][2]}")
    println("${transposeOfFirst[1][0]},${transposeOfFirst[1][1]},${transposeOfFirst[1][2]}")
    println("${transposeOfFirst[2][0]},${transposeOfFirst[2][1]},${transposeOfFirst[2][2]}")
}