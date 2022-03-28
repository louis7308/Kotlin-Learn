package 문자열

fun main() {
    var test3 = "kotlin.kt"
    var test4 = "java.java"

    // 지정한 문자열로 시작하면 true 아니면 false
    println(test3.startsWith("java")) // false
    println(test4.startsWith("java")) // true

    // 지정한 문자열로 끝나면 true 아니면 false
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    // 지정한 문자열이 포함되면 true를 반환
    println(test3.contains("lin"))
    println(test4.contains("lin"))
}