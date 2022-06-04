// クラス名の直後にそのままコンストラクタで定義する値の設定が可能(constructorは省略可能)
// コンストラクタの変数にvar や valをつけることでフィールド定義も不要となる
class Student constructor(name:String) {
    var name = name
    fun avg(math:Int,english:Int) {
        println((math + english)/2)
    }
}

fun main() {
    val student = Student("佐藤")
    student.avg(30,70)
}