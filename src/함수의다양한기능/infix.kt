package 함수의다양한기능

fun main() {
    // 좌측 값인 6이 infix 에 객체 자신을 가리키는 this 이다
    println(6 multiply 4)
    println(6 multiply(4))
}
// infix fun 자료형.이름()
infix fun Int.multiply(x : Int) : Int = this * x