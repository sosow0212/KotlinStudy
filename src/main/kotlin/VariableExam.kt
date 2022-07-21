fun main(args: Array<String>) {

    var intValue: Int = 120
    var longValue: Long = 120L
    var intValueByHex: Int = 0x1af // 16진수는 0x로 시작
    var intValueByBin: Int = 0b1011 // 2진수는 0b 로 시작
    // 8진수는 지원 X


    var doubleValue: Double = 120.1
    var doubleValueWithExp: Double = 123.5e10 // 지수 표기법 지원
    var floatValue: Float = 120.1f


    var charValue:Char = 'a'

    var booleanValue: Boolean = true

    val stringValue: String = "This is String type val"

    val multiLineStringValue: String = """
        String
        a lot
        lines
    """





    var a: Int = 100
    println(a + 10)

    var b: String = "Hello"
    println(b)
}