package 클래스

fun main() {
    var d = Dog2()

    d.run()
    d.eat()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog2 : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }
}