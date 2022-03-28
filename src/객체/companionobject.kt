package 객체

fun main() {
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    a.let {
        println("${it.name} : ${it.count}")
    }
    b.let {
        println("${it.name} : ${it.count}")
    }
    println("총계 : ${FoodPoll.total}")
}

class FoodPoll (val name: String) {
    // 공유 객체 (Static 변수 비슷)
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}