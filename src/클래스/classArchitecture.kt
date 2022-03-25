package 클래스

fun main() {
    var a = Person("전승원", 2005)
    var b = Person("백승민", 2005)
    var c = Person("가상의인물", 2003)

    a.introduce()
    b.introduce()
    c.introduce()

}

class Person(var name:String, val birthYear:Int) {
    fun introduce() {
        println("안녕하세요 ${birthYear}년생 ${name} 입니다")
    }
}