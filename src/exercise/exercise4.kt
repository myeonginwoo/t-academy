package exercise

fun main(args: Array<String>) {

    val list = listOf(
        Person("myeongin", 33, false),
        Person("wow", 20, true),
        Person("java", 60, true),
        Person("lazysoul", 10, false),
        Person("fp", 22, true),
        Person("kotlin", 35, false),
        Person("scala", 42, true),
        Person("t-academy", 40, true)
    )

    val result = TODO()

    require(result == listOf("java", "scala", "t-academy"))

}

data class Person(val name: String, val age: Int, val single: Boolean)