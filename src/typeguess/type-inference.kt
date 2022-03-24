package typeguess

fun main() {
    // 기본 타입 변수의 값으로 타입을 추론할수있다
    var a = 1234
    var b = 1235L

    var c = 12.45
    var d = 12.46f

    var e = 0xABCD
    var f = 0b01010101

    var g = true
    var h = 'a'
}