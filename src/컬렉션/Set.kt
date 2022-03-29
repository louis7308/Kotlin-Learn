package 컬렉션

fun main() {
    // 동일 한 요소를 중복해서 가질수 없다
    var a = mutableSetOf("귤", "바나나", "키위")

    for(item in a) {
        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))
}
