package classExam

fun main() {

    var a = Puppy();
    var b = Bonggu();

    a.eat();
    b.eat();
}

open class Puppy {
    // 메소드에 open이 붙어야 오버라이딩 가능
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Bonggu : Puppy() {
    override fun eat() {
        println("봉구는 음식을 먹습니다.")
    }
}