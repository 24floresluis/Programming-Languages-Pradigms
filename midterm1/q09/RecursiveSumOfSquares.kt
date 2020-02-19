fun recursiveSumOfSquares(n: Int): Int {
    return when (n) {
        1 -> 1
        else -> {
            n * n + recursiveSumOfSquares(n - 1)
        }
    }
}

fun main(args : Array<String>) {
    println(recursiveSumOfSquares(1))
    println(recursiveSumOfSquares(3))
    println(recursiveSumOfSquares(5))
    println(recursiveSumOfSquares(8))
}