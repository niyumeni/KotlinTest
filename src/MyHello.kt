class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("World!").greet()          // 创建一个对象不用 new 关键字
    // lambda(匿名函数)


    vars(1,2,3,4,5)


    // val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)


    var boxedA: Int? = 0

    val x = 5
    val y = 9
    if (x in 1..8) {
        println("x 在区间内")
    }




}


// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
    return a + b
}

fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}