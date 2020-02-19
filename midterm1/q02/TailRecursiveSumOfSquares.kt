tailrec fun tailRecursiveSumOfSquares(n: Int, sum: Int = 1) : Int {
    return when (n) {
        1 -> sum
        else -> tailRecursiveSumOfSquares(n - 1, n * n + sum)
    }
}

fun main(args : Array<String>) {
    println(tailRecursiveSumOfSquares(1))
    println(tailRecursiveSumOfSquares(3))
    println(tailRecursiveSumOfSquares(5))
    println(tailRecursiveSumOfSquares(8))
}