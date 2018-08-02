fun main(args: Array<String>) {

    var mutableInt: Int = 10
    mutableInt = 5

    var mutableString: String = "FP"
    mutableString = "Kotlin"

    val immutableInt: Int = 10
    immutableInt = 5    // Error

    val immutableString: String = "FP"
    immutableString = "Kotlin"  // Error

}