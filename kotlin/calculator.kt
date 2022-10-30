fun main() {
    print("a : ")
    val a = readln().toDouble()
    print("b : ")
    val b = readln().toDouble()
    while (true) {
        print("operation : ")
        val op = readln()
        val res = when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            "%" -> a % b
            "0" -> {
                println("exit")
                break
            }
            else -> {
                println("INVALID")
                break
            }
        }
        println("$a $op $b = $res")
    }
}
