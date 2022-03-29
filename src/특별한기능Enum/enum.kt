package 특별한기능Enum

fun main() {
    var state = State.SING
    println(state)

    state = State.SlEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

enum class State(val message2: String, val message: String) {
    SING("노래를 부릅니다", "h2"),
    EAT("밥을 먹습니다", "h34"),
    SlEEP("잠을 잡니다", "h444");

    fun isSleeping() = this == State.SlEEP
}