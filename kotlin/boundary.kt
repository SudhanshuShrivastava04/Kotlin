fun main() {
    print("rows : ")
    val rows = readln().toInt()
    print("columns : ")
    val col = readln().toInt()
    for (i in 1..rows) {
        for (j in 1..col) {
            if (i == 1 || i == rows || j == 1 || j == col) {
                print("* ")
            } else
                print("  ")
        }
        println()
    }

}

