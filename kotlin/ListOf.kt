fun main(){
    val listofname = listOf<String>("hello" ,"world")
    //Arrayof is also mutable function
    var mutablelistofname = mutableListOf<String>("hello" , "It's")
    println("enter name")
    val name = readln().toString();
    mutablelistofname.add("$name")
    for(i in 0 ..listofname.size){print("${mutablelistofname[i]} ")}
    println()
    println("this is non-mutable string -->${listofname}")

}