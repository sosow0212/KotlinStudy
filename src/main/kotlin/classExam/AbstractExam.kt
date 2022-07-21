package classExam

fun main() {

    var a = Yoon()
    a.eat()
    a.drinking()
}

// 코틀린에서 추상함수는 생성자를 가질 수 있다. (인터페이스는 가질 수 없음)
// 그리고 인터페이스에서는 open 이나 abstract 같은 키워드가 없어도 포함된 모든 함수를 서브 클래스에서 구현 및 재정의가 가능하다.
abstract class Human {
    abstract fun eat()

    fun drinking() {
        println("꿀꺽꿀꺽")
    }
}

class Yoon : Human() {
    override fun eat() {
        println("밥을 먹습니다.")
    }
}
