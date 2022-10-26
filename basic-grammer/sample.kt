fun main() {
    helloWorld()

    println(add(4, 5));

    // String Template
    val name = "Joyce"
    println("my name is ${name}")
}

fun helloWorld() {
    println("Hello World")
}

fun add (a : Int, b: Int): Int {
    return a + b
}

// val vs. var
fun hi () {
    val a : Int = 10
    var b : Int = 9

    var e : String // 바로 할당하지 않는 경우 데이터 타입 설정해줘야 함

    b = 20
}

// Array and List
fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    array[0] = 3
    list[0] = 2

}