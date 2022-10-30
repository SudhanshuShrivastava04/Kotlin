fun main(){
    println("enter size : ")
    val size = readln().toInt()
    val arr = Array(size){0}
    println("Input data : ")
    for (i in 0 until size){
        arr[i] = readln().toInt()
    }
    var max = arr[0]
    for (item in arr){
        if (item>max)
            max = item
    }
    println("max : $max")
    var min = arr[0]
    for (item in arr){
        if (item<min)
            min = item
    }
    println("min : $min")
}