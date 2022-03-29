package 함수의다양한기능

fun main() {
    sum(1, 2, 3, 4)
}

fun sum(vararg numbers: Int) { // vararg 매개변수에 몇개의 데이터가 들어올지 모를때 사용한다  ( * 다른 매개변수랑 사용할때에는 맨 마지막에 사용되어야한다 )
    var sum = 0

    for(n in numbers) {
        sum += n
    }
    print(sum)
}