class accounts(){
    var name:String? = null
    var AccNum:Int = 0
    var amount:Float = 0f

    fun AC(name:String , AccNum:Int , balance:Float){
        this.name = name
        this.AccNum = AccNum
        amount = balance
        println("Holder's name : $name")
        println("account no. : $AccNum")
        println("Amount(in Rs) : $balance")
    }

    fun deposit(money:Float){
        amount += money
        //amount = amount+money
        println(amount)
    }

    fun withdraw(money:Float){
        if (amount<money){
            println("insufficient balance")
        }
        else amount -= money
        println(amount)
    }
    fun statement(){
        println("balance: "+amount)
    }
}
fun main(){
    val account1 = accounts()
    account1.AC("sudhanshu" , 211230053 , 20000f)
    account1.deposit(5000f)
    account1.withdraw(10000f)
    account1.withdraw(15000f)
    account1.statement()
    //me gareeb hu😒
}
