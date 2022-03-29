package `변수의 고급기술`

fun main() {
    // lateinit은 초기값 설정을 늦춰준다 하지만 그전까진 사용해선 안된다 초기화가 된후에 값을 사용해야된다
    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당된 값"
    println(a.getLateInitText())
}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }
    }
}