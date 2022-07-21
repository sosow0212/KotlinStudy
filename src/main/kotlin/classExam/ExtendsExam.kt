package classExam

fun main() {
    var a = Animal("봉구", 8, "강아지")
    var b = Dog("봉구", 5)

    b.introduce()
    b.bark()
}

// open 상태가 아니면 상속을 받을 수 없다.
open class Animal (var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

// 클래스 상속
class Dog(name:String, age:Int) : Animal (name, age, "강아지") {
    fun bark() {
        println("왈왈왈")
    }
}