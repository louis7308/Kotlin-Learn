package 컬렉션

fun main() {
    // associateBy : 아이템에서 key를 추출하여 map 으로 변환하는 함수
    // groupBy : key가 같은 아이템끼리 배열로 묶어 map으로 만드는 함수
    // partition : 아이템에 조건을 걸어 두개의 컬렉션으로 나누어줌

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(
        Person("유나", 1992),
        Person("조이", 1996),
        Person("츄", 1999),
        Person("유나", 2003))

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val (over98, under98) = personList.partition { it. birthYear > 1998 }
    println(over98)
    println(under98)
}