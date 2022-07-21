fun main() {
    labelName@for (i in 1..10) {
        for (j in 1..10) {
            if(i ==1 && j ==2) break@labelName
            println("i : $i, j: $j")
        }
    }
}