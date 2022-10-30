fun main(){
    val name = "sudhanshu"
    var message : String ?= null
    val print = when(message){
        null -> "hey"
        else -> message
    }
    println(name)
    println(print)
}
