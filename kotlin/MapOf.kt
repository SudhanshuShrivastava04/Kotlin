fun main(){
    //mapOf is a immutable function
    val mapofnames = mapOf<String,String>("name" to "Sudhanshu" , "age" to "19" , "nationality" to "indian")
    println(mapofnames["name"])
    println(mapofnames["age"])
    println(mapofnames["nationality"])
    val hashMapofnames = hashMapOf<String, String>("work" to "student")
    println(hashMapofnames["work"])
    
    hashMapofnames["work"] = "CollegeStudent"
    println(hashMapofnames["work"])
}