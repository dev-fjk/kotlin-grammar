fun main() {
    val array = arrayListOf("sato","suzuki","takahashi")
    val array2 = arrayListOf("ito","yamada")
    println(array[0])
    println(array[1])
    println(array[2])

    val parentArray = arrayListOf(array,array2)
    println(parentArray[0][1]) // 鈴木
}