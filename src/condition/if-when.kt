package condition

fun main() {
    // 조건문
    var appleCount: Int? = 5
    var appleCount2: Int = 3

//    appleCount = appleCount2

    if(appleCount > 10) {
        println("사과가 한박스 보다 많은양을 가지고 있다")
    } else {
        println("사과가 한 박스 양보다 적게 가지고 있다")
    }

    // switch case 문과 유사
    when(appleCount) {
        1 -> println("a")
        2/1 -> println("a")
        appleCount2 -> println("g")
        4,6 -> println("d")
        in 7..9 -> println("h")
        !in 8..9 -> println("t")
        null -> println("y")
        else -> println("해당하지 않는 값입니다.")
    }

    
}
