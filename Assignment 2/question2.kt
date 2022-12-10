package Assignment2

fun frequency(array: IntArray): IntArray {
    var frequencyArray = IntArray(10){_->0}
    for (i in array.indices){
        if(array[i] in 0..10){
            frequencyArray[0]+=1
        }
        else if(array[i] in 11..20){
            frequencyArray[1]+=1
        }
        else if(array[i] in 21..30){
            frequencyArray[2]+=1
        }
        else if(array[i] in 31..40){
            frequencyArray[3]+=1
        }
        else if(array[i] in 41..50){
            frequencyArray[4]+=1
        }
        else if(array[i] in 51..60){
            frequencyArray[5]+=1
        }
        else if(array[i] in 61..70){
            frequencyArray[6]+=1
        }
        else if(array[i] in 71..80){
            frequencyArray[7]+=1
        }
        else if(array[i] in 81..90){
            frequencyArray[8]+=1
        }
        else if(array[i] in 91..100){
            frequencyArray[9]+=1
        }
    }
    return frequencyArray
}
fun printFrequency(array: IntArray){
    var x:Int = 1
    var y:Int = 10
    for(i in array.indices) {
        println("Frequency in class $x to $y: " + array[i])
        x+=10
        y+=10
    }
}
fun main(){
    var array  = IntArray(50) { _->(0..101).random()}
    println("Random Array : "+array.contentToString())
    var freqArray = frequency(array)
    printFrequency(freqArray)
}