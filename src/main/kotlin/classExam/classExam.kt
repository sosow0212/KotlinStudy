package classExam

fun main() {
    var a = Person("이재윤", 1999)
    var b = Person("노윤재", 1999)

    // 보조 생성자 사용하는 인스턴스
    var c = Person("이름")

    println(a.name)
    println(a.introduce())

}

class Person(var name: String, val birthYear: Int) {
    init {
        // 생성자
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }


    // 보조 생성자
    constructor(name:String) : this(name, 1999) {
        println("보조 생성자 사용됨")
    }


    fun introduce() {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다.")
    }
}