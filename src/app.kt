fun main(args: Array<String>) {
    println("Hello world 123")
    println(sum(5,6))
    println(minus(7,5))
    printSum(1,3)
    println(a)

    b += 1;
    println(b)

    var c : Int;
    c = 10
    c += 5;
    println(c)
}

fun sum(a: Int, b : Int): Int {
    return a + b
}

fun minus(a : Int, b : Int) = a-b

fun printSum(a: Int, b : Int){
    println("Sum of $a and $b is ${a + b}")
}

var a : Int = 10
var b = 2








