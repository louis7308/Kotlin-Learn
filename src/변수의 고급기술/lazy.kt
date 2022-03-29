package `변수의 고급기술`

fun main() {
    // lazy 값을 처음 사용할때 초기화가 되기떄문에 코드를 좀더 최적화 하게 짤수있다

    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
}