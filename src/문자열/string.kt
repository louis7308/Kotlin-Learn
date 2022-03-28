package 문자열

fun main() {
    val test1 = "Test.Kotlin.String"

    // 문자열 길이 18
    println(test1.length)

    // 소문자 변환
    println(test1.toLowerCase())
    // 대문자 변환
    println(test1.toUpperCase())

    // 특정 문자만 나눌수 있습니다
    val test2 = test1.split(".")
    println(test2)

    // 배열로 나눠진 문자열을 합치는 함수
    println(test2.joinToString())
    println(test2.joinToString("-"))

    //문자열 일부만 사용하기
    println(test1.substring(5..10))

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    println(nullString.isNullOrEmpty()) // true
    println(emptyString.isNullOrEmpty()) // true
    println(blankString.isNullOrEmpty()) // false
    println(normalString.isNullOrEmpty()) // false

    println()

    println(nullString.isNullOrBlank()) // true
    println(emptyString.isNullOrBlank()) // true
    println(blankString.isNullOrBlank()) // true
    println(normalString.isNullOrBlank()) // false
}