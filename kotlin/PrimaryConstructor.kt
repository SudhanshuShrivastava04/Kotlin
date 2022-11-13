/*
constructors are of two types
1.Primary
2.Secondary
 */
class student(name:String , rollNum:Int){
    var Name:String? = null
    var RollNum:Int? = null
    init {
        this.Name=name.capitalize()
        if (rollNum<=0){RollNum=null}
        else this.RollNum=rollNum
    }
    fun print(){
        println(Name+":"+RollNum)
    }
    //we can also initialize constructor as we initialize in java
}
fun main(){
    val s1 = student("sudhanshu" , 211230053)
    val s2 = student("akshay" , -1)
    s1.print()
    s2.print()
    s2.del()
}
