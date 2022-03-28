package 객체

fun main() {
    // Object 객체는 사용할때 즉시 생성 되기 때문에 생성자를 따로 만들 필요가 없다
    // Object 객체는 공용 데이터로 사용할때 자주 쓰인다
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)
    Counter.clear()
    println(Counter.count)
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}