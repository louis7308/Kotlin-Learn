package 함수의다양한기능

fun main() {
    // 오버로딩은 함수의 이름은 같지만 매개변수의 타입이나 매개 변수 갯수가 다르면 같은 이름에 함수를 여러개 만들수있다
    read(7)
    read("안녕하세요")
}

fun read(x: Int) {
    println("숫자${x}입니다")
}

fun read(x: String) {
    println(x)
}