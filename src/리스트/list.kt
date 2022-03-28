package 리스트

fun main() {
    // List는 class 'Collection' 클래스를 상속 받는 서브 클래스이다
    // 생성 후 추가 삭제 불가능
//    val a = listOf("사과", "딸기", "배")
//    println(a[1])
//
//    for(fruits in a) {
//        println("${fruits}:")
//    }

    // 생성 후 추가 삭제 가능
    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)

}