fun main(){
    println("enter size")
    val size = readln().toInt()
    val arr = Array(size){0}
    println("enter data")
    for (i in 0 until size){
        arr[i] = readln().toInt();
    }
    println("here is the array")
    for (i in 0 until size){
        print("${arr[i]} ")
    }
    println()
    println("target")
    val target = readln().toInt()
    println("index is "+search(arr,target))
}
fun search(array: Array<Int>,target: Int): Int{
    var index : Int = -1
    for (i in 0 until array.size){
        if (array[i]== target){
            index = i
        }
    }
    return index
}