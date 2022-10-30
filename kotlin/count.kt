fun main(){
    var positive : Int =0
    var negative : Int =0
    var zeros : Int =0
    println("press 1 or 0")
    var input = readln().toInt()
    while (input == 1){
        println("enter the number")
        val num = readln().toInt()
        if (num < 0)
            negative++
        else if (num>0)
            positive++
        else
            zeros++
        println("press 1 or 0")
        input = readln().toInt()
    }
    println(positive)
    println(negative)
    println(zeros)
}