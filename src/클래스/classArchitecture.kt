package 클래스

fun main() {
    var a = Person("전승원", 2005)
    var b = Person("백승민", 2005)
    var c = Person("가상의인물", 2003)

    var d = Person("강민")
    var e = Person("홍정우")
    var f = Person("강주현")


}
            // 기본 생성자
class Person(var name:String, val birthYear:Int) {
    init { // init 은 인스턴스 생성자 생성될때 실행되는 함수
        // this는 인스턴스 자신의 속성이나 함수를 호출하기 위해 사용됩니다. [클래스 내부에서 사용됨]
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    // 보조 생성자
    constructor(name: String) : this(name, 2005) {
        println("보조 생성자가 사용되었습니다")
    }
                
//  메소드
//    fun introduce() {
//        println("안녕하세요 ${birthYear}년생 ${name} 입니다")
//    }
}