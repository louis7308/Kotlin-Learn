package 클래스

fun main() {
    var t = Tiger()
    t.eat()
}

open class Animal2 {
    open fun eat() {
        println("음식을 먹습니다다")
   }
}

class Tiger : Animal2()
{
    override fun eat() {
        println("고기를 먹습니다")
    }
}
