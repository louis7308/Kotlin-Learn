package 클래스

fun main() {
    // 추상화 함수,  추상클래스
    var r = Rabbit()

    r.eat()
    r.sniff()
}
// abstract 추상화 : 기능만을 정의 해놓고 실제 기능은 상속 받아서 제작한다
abstract class Animal3() {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}