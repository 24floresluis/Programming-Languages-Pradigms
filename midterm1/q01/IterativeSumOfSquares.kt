fun iterativeSumOfSquares(n: Int): Int {
    return (1..n).reduce { a, b -> a + b * b }
}

fun main(args : Array<String>) {
    println(iterativeSumOfSquares(1))
    println(iterativeSumOfSquares(3))
    println(iterativeSumOfSquares(5))
    println(iterativeSumOfSquares(8))
}