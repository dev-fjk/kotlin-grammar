fun main() {
    // 定数はval
    val num:Int = 1
    println(num)

    // javaと違って小文字のintなどは予約語ではない
    var byte:Byte = 1
    var short:Short = 12345
    var int:Int = 1234567890
    var long:Long = 123456789000
    println(byte)
    println(short)
    println(int)
    println(long)
    println(byte.javaClass.kotlin) // 型を調べるとき
}