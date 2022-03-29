package 컬렉션

fun main() {
    // flatMap : 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
    // getOrElse : 인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수
    // zip : 컬렉션 두개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어줌

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}