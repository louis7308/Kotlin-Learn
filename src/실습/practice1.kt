package 실습

fun main() {
    val people = listOf(
        Person("전승원", 27, "별명"),
        Person("전승원", 27, nickname = "별명"),
        Person(
            name = "전승원",
            nickname = "별명",
            age = 27
        )
    )
    people.forEach{ i ->
        i.name = "hi"
        i.position
        println(i.position)
    }
}

class Person(name: String, age: Int, nickname: String) {
    var name = name
    var position: Int = 0
        get() = 5
}