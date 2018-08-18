fun main(args: Array<String>) {

}

sealed class FpList<out T>

data class Cons<T>(val value: T) : FpList<T>()
object Empty : FpList<Nothing>()