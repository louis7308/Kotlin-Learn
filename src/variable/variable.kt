package variable

fun main() {
    // 정수 (Byte , Short, Int, Long) [정수형의 리터럴 허용 범위 : 10진수, 16진수, 2진수] **8진수 제외
    var intValue: Int = 1234;
    var nullAllowNumber: Int? = null; // null exception 허용
    var longValue: Long = 1151255121L;
    var intValueByHex: Int = 0x1af // 16진수
    var intValueByBin: Int = 0b10110110 // 2진수

    // 실수 (Float, Double)
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10
    var floatValue: Float = 123.5f

    // 문자(Char) * UTF-16 BE 글자 하나 하나 2Byte
    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'

    // 문자열(String)
    var stringValue = "My name is Seungwon"
    val koreanStringValue = "나는 코틀린 장인"

    // 참과거짓(Boolean)
    var isBoolean: Boolean = true


}