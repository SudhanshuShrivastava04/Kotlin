fun main(){
    val listofname = listOf<String>("hello" ,"world")
    //Arrayof is also mutable function
    var mutablelistofname = mutableListOf<String>("hello" , "It's")
    println("enter name")
    val name = readln().toString();
    mutablelistofname.add("$name")
    mutablelistofname.forEach {
        println(it)
    }
    
    val mapofnames = mapOf<String,String>("rollNum" to "211230053" , "age" to "19" , "nationality" to "indian")
    mapofnames.forEach {
        println(it)
    }
    val hashMapofnames = hashMapOf<String, String>("work" to "student" , "comments" to "Sab chill hai!")
    //hashMaps are mutable
    hashMapofnames["work"] = "CollegeStudent"
    hashMapofnames.forEach { t, u ->
        println(t+" --> "+u)
    }
}
