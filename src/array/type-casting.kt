package array

fun main() {
    // type-casting (형 변환)
    // [ toByte(), toShort(), toInt(), toLong()
    // toFloat(), toDouble(), toChar() ]

    var intValue: Int = 12345
    var LongValue: Long = intValue.toLong() // 명시적 형변환(내가 직접 형변환을 시켜야되는) 을 해줘야된다

    // 배열 (arrayof(값, 값2, ...)) 배열 생성
    // 빈 배열 생성 (arrayOfNulls<reified>(크기)
    var intArr: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 44
    println(intArr[2])
    println(intArr[4])
    println(nullArr[2])
}