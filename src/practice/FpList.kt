package practice

sealed class FpList<out T>

data class Cons<out T>(val head: T, val tail: FpList<T>) : FpList<T>()
object Nil : FpList<Nothing>()
