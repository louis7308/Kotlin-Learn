package 객체

fun main() {
    // 옵저버 패턴 : 이벤트가 일어나는것을 감시하는 감시자의 역활 Ex( 키가 입력 된다던지 , 터치가 된다던지 , 데이터가 들어온다던지 )
    // 이벤트 : 함수로 직접 요청하지 않았지만 시스템 또는 루틴에 의해서 발생하게 되는 동작들이다.
    // 옵저버 패턴에는 이벤트 수신자 , 이벤트의 발생 및 전달자가 있다 ( 하지만 수신자는 발생자를 참조할수있지만 발생자는 수신자를 참조할수없어 인터페이스를 만들어줘야된다 )
    // Class[A] <- interface -> Class[B]
    EventPrinter().start()
}

// 이 인터페이스를 상속받아 , 이벤트가 발생할 때마다 호출할 메소드를 구현하면 됨
interface EventListener {
    fun onEvent(count: Int)
}

// 5의 배수가 감지되면 이벤트를 발생하는 Counter2 Class B
class Counter2(var listener: EventListener) { // 생성자로 EventListener 넘겨 받음
    fun count() {
        for (i in 1..100) {
            if(i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }

}


// 이벤트를 수신 받았을 때 화면에 5의 배수를 출력하는 EventPrinter
class EventPrinter {

    fun start() {
        // this 를 통해 EventListener 구현부를 넘겨줌 ( 다형성 활용 )
        val counter = Counter2(object: EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}