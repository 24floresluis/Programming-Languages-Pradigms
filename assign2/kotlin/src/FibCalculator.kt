package assign2

class FibCalculator {

    fun fibonacciIterative(n: Int): List<Int> {
        val series = mutableListOf(1, 1)
        for (i in 2..n) {
            series += series.drop(series.size - 2).sum()
        }
        return series.take(n + 1)
    }

    fun fibonacciRecursive(n: Int): List<Int> {
        return when (n) {
            0 -> listOf(1)
            1 -> listOf(1, 1)
            else -> {
                val list = fibonacciRecursive(n - 1)
                list + list.drop(list.size - 2).sum()
            }
        }
    }

    tailrec fun fibonacciRecursiveIterative(n: Int, list: List<Int> = listOf(1, 1)): List<Int> {
        return when (n) {
            0 -> listOf(1)
            1 -> list
            else -> fibonacciRecursiveIterative(n - 1, list + list.drop(list.size - 2).sum())
        }
    }
}