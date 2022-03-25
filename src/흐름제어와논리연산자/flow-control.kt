package 흐름제어와논리연산자

fun main() {
    for(i in 1..10) { // 반복문 내에서 break , continue
        if(i == 3) continue
        println(i)
    }

    loop@for (i in 1..10) {
        for(j in 1..10) {
            if(i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }

    println(true && false) // false
    println(true || false) // true
    println(!true) // false
    println(!false) // true
}