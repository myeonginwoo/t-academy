fun main(args: Array<String>) {
    println(nonPureFunction2(4))    // 5
    println(nonPureFunction2(4))    // 5
    println(nonPureFunction2(4))    // 5
    x = 10
    println(nonPureFunction2(4))    // 14
}

var x = 1

fun nonPureFunction2(input: Int): Int{
    return input + x
}

fun pureFunction(input: String): String {
    return "Hello " + input
}

val strBuilder: StringBuilder = StringBuilder("Hello ")

fun nonPureFunction(input: String): String {
    return strBuilder.append(input).toString()
}