package 고차함수와람다함수

fun main() {
    val c: (String) -> Unit =  { str ->
        println("$str 람다함수")
        println("여러구문을")
        println("사용할수있습니다")
    }


    // 람다함수는 return 값을 마지막 결과 코드인 a + b의 값을 Int로 반환함
   val calculate: (Int, Int) -> Int = { a, b ->
        println(a)
        println(b)
        a + b
    }

    // 파라미터(매개변수)가 없는 람다함수
    // 파라미터(매개변수)가 없다면 {} 안에 실행할 구문만 놔두면 된다
    val d: () -> Unit = { println("파라미터가 없습니다") }

    // 파라미터가 한개라면 (it) 으로 대체 가능
    val s: (String) -> Unit = { println("$it 파라미터가 없습니다") }

   // 고차 함수
    fun goChaFun(str: (String) -> Unit) {
        str("재밋게")
    }

    // 고차 함수
    fun goChaFun2(a: Int ,b: Int,sum: (Int, Int) -> Int) {
        sum(a, b)
    }

    // 고차 함수
    fun goCharFun3(zero: () -> Unit) {
        zero()
    }

    fun goCharFun4(oneVar: (String) -> Unit) {
        oneVar("h2")
    }

    goChaFun(c)
    goChaFun2(10, 20, calculate)
    goCharFun3(d)
    goCharFun4(s)
}