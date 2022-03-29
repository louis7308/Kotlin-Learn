package 중첩클래스와내부클래스

fun main() {
    // 중첩 클래스는 외부 클래스의 내용을 공유 할수 없음
    // 내부 클래스는 외부 클래스의 속성과 함수의 사용이 가능 (inner)

    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}
class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}