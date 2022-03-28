package `변수간에 동일성`

fun main() {
    val a: String? = "Kotlin Exam"
    // null safe operator 연산자는 a 객체가 null 값이라면 뒤에있는 함수를 실행시키지 않는다
//    println(a?.toUpperCase())
//    // elvis 연산자 객체가 null이 아니라면 그대로 사용되지만 null 이라면 뒤에 문자열인 default를 사용한다
//    println(a?:"default".toUpperCase())

    // non-null assertion operator 구문이 null이면 에러가 나고 프로그램이 꺼진다
//    println(a!!.toUpperCase())

    // 스코프 함수랑 잘 어울린다
    a?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
}