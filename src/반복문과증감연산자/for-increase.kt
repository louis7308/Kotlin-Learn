package 반복문과증감연산자

fun main() {
    // 조건형 반복문 ( while , do..while ) 범위형 반복문 ( for )
    var num = 0

    while(num < 5) {
        num++;
        println(num)
    }

    do
    {
        println(num++)
    } while(num < 10)

    for(i in 0..9) {
        print(i)
    }

    for(i in 9 downTo 0) {
        print(i)
    }

}