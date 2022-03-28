package 다형성

fun main() {
    var c = Drink()
    c.drink()
    // Up-Casting 상위 자료형인 수퍼클래스로 변환 (그냥 상위 자료형에 담으면 됨)
    var a: Drink = Cola()
    a.drink()


//
//    // Down-Casting Up-Casting 된 인스턴스를 하위 자료형으로 변환할때 (이건 별도의 연산자 필요 as , is )
//    // as는 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자이다
//    // is는 변수가 자료형에 호환되는지를 먼저 체크한후 변환해주는 캐스팅 연산자이다.
    var b = a as Cola // as 는 반환 값 뿐만 아니라 변수 자체에도 다운캐스팅을 적용해준다
    b.washDishes()
    a.washDishes()
//
    if(a is Cola) {
        // 이 안에서만 a 가 Cola가 됨
        a.washDishes()
    }

}
open class Drink
{
    var name = "음료"
    open fun drink() {
        println("${name}를 마십니다")
    }
}

class Cola : Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다")
    }
}
