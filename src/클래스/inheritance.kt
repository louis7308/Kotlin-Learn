package 클래스


fun main() {
    // 상속 실무 Ex)
// 1. 기존 클래스에서 조금추가된 다른 클래스 만들때
// 2. 기존 클래스 에서 공통 된것들만 뽑아 코드관리를 편하게 할때

    // 속성과 함수를 물려주는 쪽을 수퍼 클래스
    // 물려받는 쪽을 서브 클래스 라고 한다

    var a = Animal("별이", 2, "개")
    var b = Dog("별이", 2)
    var c = Cat("루이비", 1)

    a.introduce()

    b.introduce()
    b.bark()

    c.introduce()
    c.meow()
}

open class Animal(var name:String, var age:Int, var type:String)
{
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다")
    }
}

class Dog (name:String, age:Int) : Animal(name, age, "개")
{
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이")
{
    fun meow() {
        println("야옹")
    }
}