fun main(args: Array<String>) {

    var mutableInt: Int = 10
    mutableInt = 5

    var mutableString: String = "FP"
    mutableString = "Kotlin"

//    val immutableInt: Int = 10
//    immutableInt = 5    // Error
//
//    val immutableString: String = "FP"
//    immutableString = "Kotlin"  // Error

    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList = mutableListOf(4, 5, 6)
    mutableList.add(10)

    println(mutableList) // [4, 5, 6, 10]

    var immutableList: List<Int> = listOf(1, 2, 3)
    immutableList = listOf(4, 5, 6)
//    immutableList.add(10)   // Error

    println(immutableList)  // [4, 5, 6]
    immutableList.plus(10)
    println(immutableList)  // [4, 5, 6]
    println(immutableList.plus(10))  // [4, 5, 6, 10]
    val newList = immutableList.plus(10)
    println(immutableList)  // [4, 5, 6]
    println(newList)        // [4, 5, 6, 10]
}