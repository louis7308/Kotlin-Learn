package 객체

fun main() {
    // 옵저버 패턴 : 이벤트가 일어나는것을 감시하는 감시자의 역활 Ex( 키가 입력 된다던지 , 터치가 된다던지 , 데이터가 들어온다던지 )
    // 이벤트 : 함수로 직접 요청하지 않았지만 시스템 또는 루틴에 의해서 발생하게 되는 동작들이다.
    // 옵저버 패턴에는 이벤트 수신자 , 이벤트의 발생 및 전달자가 있다 ( 하지만 수신자는 발생자를 참조할수있지만 발생자는 수신자를 참조할수없어 인터페이스를 만들어줘야된다 )

    EventPrinter().start()
}

interface EventListener { // 인터페이스는 기능만 명시하는 추상적인 존재이다
    fun onEvnet(count: Int) //추상 함수
}

class NewCounter(var listener: EventListener)
{

    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0) listener.onEvnet(i) // 5의 배수가 될때마다 EventListener의 onEvent를 호출 하도록 한다
        }
    }
}

//class EventPrinter: EventListener {
//    override fun onEvnet(count: Int) {
//        print("${count}-")
//    }
//
//    fun start() {
//        // this 는 EvnetPrinter 객체를 가리키지만 NewCounter 에서 EventListener만 받기를 원하기 떄문에 EventListener만 할당받습니다. (객체지향의 다형성)
//        val counter = NewCounter(this)
//        counter.count()
//    }
//}

// 익명 객체로 만드는법
class EventPrinter {
    fun start() {
        val counter = NewCounter(object: EventListener { // 익명 객체 처럼 만들면 인터페이스를 구현한 객체를 코드 중간에도 '즉시 생성' 하여 사용할수 있다.
            override fun onEvnet(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}