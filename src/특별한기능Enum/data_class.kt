package 특별한기능Enum

fun main() {
    // Data class : 다섯 가지 기능 제공
    // - equals() : 내용의 동일성을 판단하는
    // - hashcode() : 객체의 내용에서 고유한 코드를 생성하는
    // - toString() : 포함된 속성을 보기쉽게 나타내는
    // - copy() : 객체를 복사하여 똑같은 내용의 새 객체를 만드는
    // - componentX() : 속성을 순서대로 반환하는

// 그냥 클래스와 Data 클래스 차이점
//    val a = General("짱구", 212)
//
//    println(a == General("짱구", 212)) // false
//    println(a.hashCode()) // 1504109395
//    println(a) // 특별한기능Enum.General@59a6e353
//
//    val b = Data("루인", 304)
//
//    println(b == Data("루인", 304)) // true
//    println(b.hashCode()) // 47073184
//    println(b) // Data(name=루인, id=304)
//
//    println(b.copy()) // Data(name=루인, id=304)
//    println(b.copy("아린")) // Data(name=아린, id=304)
//    println(b.copy(id = 668)) Data(name=루인, id=668)

    val list = listOf(
        Data("보영", 212),
        Data("루다", 306),
        Data("아린", 618))

    for((a, b) in list) { // componentX 는 배열의 값 들을 순회할때 사용된다 그러므로 a 는 component1, b 는 component2 이다다
       println("${a}, ${b}")
    }
}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)