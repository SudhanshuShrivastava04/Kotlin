fun main(){
    println("size")
    val size = readln().toInt()
    val arr = Array(size){0}
    println("enter elements : ")
    for (i in 0 until size){
        arr[i] = readln().toInt()
    }
    println("here is the array")
    for (i in 0 until size){
        print("${arr[i]} ")
    }
    println()
    println("index")
    val index = readln().toInt()
    if (index<size) println(arr[index]) else println("invalid index")
    println("change index")
    val new_index = readln().toInt()
    println("new value")
    val value = readln().toInt()
    arr[new_index] = value
    for (i in 0 until size){
        print("${arr[i]} ")
    }


}