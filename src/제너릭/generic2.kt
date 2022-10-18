package 제너릭

fun main() {
    println("print" + add(1, "10"))
}


fun <T> add(a: T, b: T) : T {
    return (a.toString().toDouble() + b.toString().toDouble()) as T
}