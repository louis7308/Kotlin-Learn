package 제너릭

fun main() {
    // 제너릭 : 클래스나 함수에서 사용하는 자료형을 외부에서 지정할 수 있는 기능
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class B: A() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class C: A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T: A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}