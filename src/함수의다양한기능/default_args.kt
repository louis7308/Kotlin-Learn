package 함수의다양한기능

fun main() {
    deliveryItem("짬뽕")
    deliveryItem("짬뽕", 3)
    deliveryItem("짬뽕", 30, "학교")
    deliveryItem("짬뽕", destination = "친구집")
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}