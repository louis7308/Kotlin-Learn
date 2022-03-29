package 컬렉션

fun main() {
    // MAP 키 와 값 쌍으로 이루어진 형태
    // Map 은 Put(추가), remove(제거) 로 이루어져 있다

    val a = mutableMapOf(
        "레드벨벳" to "음파음파",
        "트와이스" to "FANCY",
        "ITZY" to "ICY"
    )

    for(entry in a ) {
        println("${entry.key} : ${entry.value}")
    }
    a.put("오마이걸", "번지")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["레드벨벳"])
}