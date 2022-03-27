package 고차함수와람다함수

fun main() {
    // :: 일반 함수를 고차 함수로 변경해주는 연산자
    b(::a)

    // 람다 함수느 그 자체가 고차 함수 이기 떄문에 연산자 사용은 필요가 없다
    val c = { str: String -> println("$str 람다 함수 입니다") }
    b(c)
}
fun a (str: String) {
    println("$str 함수 a")
}

// 함수를 자료형으로 넘길때 (자료형1, 자료형2, ..) -> 반환형(Unit 반환형이 없을때 사용)
fun b (func: (String) -> Unit) {
    func("문자열 b가 호출되었습니다.")
}