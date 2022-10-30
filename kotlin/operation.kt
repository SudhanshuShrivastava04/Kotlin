fun main() {
    print("a = ")
    val a = readln().toDouble()
    print("b = ")
    val b = readln().toDouble()
    print("operation = ")
    val c = readln().trim()
    when (c) {
        "+" -> {
            println("$a + $b = ${a + b}")
        }
        "-" -> {
            println("$a - $b = ${a - b}")
        }
        "*" -> {
            println("$a * $b = ${a * b}")
        }
        "/" -> {
            println("$a / $b = ${a / b}")
        }
        "%" -> {
            println("$a % $b = ${a % b}")
        }
        else -> println("**INVALID**")
    }
}