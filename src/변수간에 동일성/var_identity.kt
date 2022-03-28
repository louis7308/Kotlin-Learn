package `변수간에 동일성`

fun main() {
    // 동일성에는 [내용의 동일성, 객체의 동일성]
    // 내용의 동일성 : 메모리 상에 서로 다른 곳에 할당된 객체라고 해도 내용이 같다면 같다고 한다 (연산자 == )
    // 객체의 동일성 : 서로 다른 변수가 메모리상에 같은 객체를 가리키고 있을때 같은 객체라고 판단한다 (연산자 ===)
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a == b) // true
    println(a === b) // false

    println(a == c) // true
    println(a === c) // true

    println(a == d) // false
    println(a === d) // false
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?) : Boolean {
        if(other is Product) { // 이안에서만 other Product됨
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}