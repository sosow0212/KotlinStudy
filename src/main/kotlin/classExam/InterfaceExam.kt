package classExam

// 인터페이스에서는 open 이나 abstract 같은 키워드가 없어도 포함된 모든 함수를 서브 클래스에서 구현 및 재정의가 가능하다.
fun main() {
    var a = Lee()
    a.eat()
    a.run()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Lee : Runner, Eater {
    override fun run() {
        println("달립니다.")
    }

    override fun eat() {
        super.eat()
    }
}