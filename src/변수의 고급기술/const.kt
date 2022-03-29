package `변수의 고급기술`

fun main() {
    var food = Food()
    food.searchPrice(Food.FOOD_CREAM_PASTA)
    food.searchPrice(Food.FOOD_STEAK)
    food.searchPrice(Food.FOOD_PIZZA)
}

class Food {
    fun searchPrice(foodName: String) {
        val price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원 입니다")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}