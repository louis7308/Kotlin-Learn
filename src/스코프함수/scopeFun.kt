package 스코프함수

fun main() {
    // 스코프 함수란 클래스로 부터 만들어진 인스턴스를 보다 깔끔하게 쓰기 위해 쓰인다
    // 스코프함수에는 ( apply , run , with , also , let ) 등이 있다
    var price = 5000
    var name = "하이2"

    //apply 는 인스턴스를 생성한 후 변수에 담기전에 '초기화 과정' 을 할때 많 이 쓰인다.
    var a = Book("승원의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    // also 는 it 을 사용하여 main 함수에서 미리 정의된 변수와 상관없이 인스턴스의 값만 사용 할수 있게 한다
    var b = Book("승원의 코틀린", 10000).also {
        it.name = "[초특가]" + it.name
        it.discount()
    }

    // run 함수는 이미 인스턴스가 만들어진 후에 인스턴스의 함수나 속성을 scope내에서 사용해야 할때 사용됩니다
    // run 함수는 main 함수에 선언된 변수를 더 우선시 보기 때문에 같은 이름의 변수가 있으면 main함수 쪽에 있는 변수를 사용한다
    a.run {
        println("run으로 호출한 상품명: ${name}, 가격: ${price}원")
    }
    // let 는 it 을 사용하여 main 함수에서 미리 정의된 변수와 상관없이 인스턴스의 값만 사용 할수 있게 한다
    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }


    // with (참조연산자 대신 인스턴스를 파라미터로 받는다)함수는 이미 인스턴스가 만들어진 후에 인스턴스의 함수나 속성을 scope내에서 사용해야 할때 사용됩니다
    // with 함수는 main 함수에 선언된 변수를 더 우선시 보기 때문에 같은 이름의 변수가 있으면 main함수 쪽에 있는 변수를 사용한다
    with(a) {
        println("with로 호출한 상품명: ${name}, 가격: ${price}원")
    }
}

class Book(var name: String, var price: Int)
{
    fun discount() {
        price -= 2000
    }
}
