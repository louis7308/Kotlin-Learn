package 컬렉션

fun main() {
    // 컬렉션 [ List, Set, Map ] 자주 사용되는 함수들을 알아보자
    // forEach : 모든 아이템을 it이라는 변수로 순서대로 참조 할수있다
    // filter : 특정한 조건을 걸어 그 조건내에 적합한 것들로만 반환하여 다시 컬렉션을 만들어준다
    // map : it 의 수식을 주어 값을 변경하면 그 변경된 값인 형태로 컬렉션을 반환하여 만들어준다

    // any {it == 0} : 하나라도 조건에 맞으면 true
    // all {it == 0} : 모두 조건에 맞으면 true
    // none {it == 0} : 하나도 조건에 맞지 않으면 true

    // first() 컬렉션의 첫 번째 아이템 반환하지만 first{it > 3} // 람다 형식으로 사용하면 조건에 맞는 첫번째 아이템을 반환 ( 대체 find() 함수로 가능 )
    // last() 컬렉션의 마지막 아이템 반환하지만 last{it > 3} // 람다 형식으로 사용하면 조건에 맞는 마지막 아이템을 반환 ( 대체 findLast() 함수로 가능 )
    // first 와 last를 사용하다 오류가 날수도 있다 왜냐하면 조건에 맞는 객체가 없거나 컬렉션이 비어있는 경우에는 NoSuchElementException이 작동한다
    // 그러니 fristOrNull 이나 lastOrNull 을 사용해서 비어있을때 null 값을 보내주는 함수를 사용하자

    // count() : 컬렉션의 모든 아이템의 개수 반환
    // count{ it < 7 } : 조건에 맞는 아이템의 개수 반환

    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach{ print(it + " ")}
    println()

    println(nameList.filter{ it.startsWith("김")}) // 배열 형태로 반환

    println(nameList.map{ "이름 : " + it })

    println(nameList.any{it  == "김지연"})
    println(nameList.all{it.length == 3})
    println(nameList.none{it.startsWith("이")})

    println(nameList.first{ it.startsWith("김")})
    println(nameList.last{it.startsWith("김")})
    println(nameList.count{it.contains("지")})
}