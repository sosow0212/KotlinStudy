fun main() {

    var a = 0
    while(a < 5) {
        println(a)
        a++
    }


    // 0..9 라고 써주면 0 <= i <= 9 가 범위이다.
    for(i in 0..9) {
        println(i)
    }


    // step 사용 / 아래 예시에서는 0,3,6,9로 3씩 증가된다.
    for(i in 0..9 step 3) {
        print(i)
    }


    // 감소하는 경우 downTo 키워드를 붙여주면 된다.
    for(i in 9 downTo 0) {
        print(i)
    }


    // 문자열도 가능하다!
    for(i in 'a'..'e') {
        print(i)
    }
}
