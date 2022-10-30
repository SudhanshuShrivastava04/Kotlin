fun main(){
    print("enter letter : ")
    var letter = readln().toCharArray()[0]
    for (i in letter..'z')  {
        print("$i ")
    }
    println()
    for(i in 'a' until letter){
        print("$i ")
    }
    print("_ ")
    for (i in letter+1..'z'){
        print("$i ")
    }

}