package assign2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FibCalculatorTest {

    var fibCalculator = FibCalculator()

    @Test
    fun canary() {
        assertTrue(true)
    }

    @Test
    fun iterativeFib0() {
        assertEquals(listOf(1), fibCalculator.fibonacciIterative(0))
    }

    @Test
    fun iterativeFib1() {
        assertEquals(listOf(1, 1), fibCalculator.fibonacciIterative(1))
    }

    @Test
    fun iterativeFib2() {
        assertEquals(listOf(1, 1, 2), fibCalculator.fibonacciIterative(2))
    }

    @Test
    fun iterativeFib3() {
        assertEquals(listOf(1, 1, 2, 3), fibCalculator.fibonacciIterative(3))
    }

    @Test
    fun iterativeFib4() {
        assertEquals(listOf(1, 1, 2, 3, 5), fibCalculator.fibonacciIterative(4))
    }

    @Test
    fun iterativeFib5() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8), fibCalculator.fibonacciIterative(5))
    }

    @Test
    fun iterativeFib10() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89), fibCalculator.fibonacciIterative(10))
    }

    @Test
    fun recursiveFib0() {
        assertEquals(listOf(1), fibCalculator.fibonacciRecursive(0))
    }

    @Test
    fun recursiveFib1() {
        assertEquals(listOf(1, 1), fibCalculator.fibonacciRecursive(1))
    }

    @Test
    fun recursiveFib2() {
        assertEquals(listOf(1, 1, 2), fibCalculator.fibonacciRecursive(2))
    }

    @Test
    fun recursiveFib3() {
        assertEquals(listOf(1, 1, 2, 3), fibCalculator.fibonacciRecursive(3))
    }

    @Test
    fun recursiveFib4() {
        assertEquals(listOf(1, 1, 2, 3, 5), fibCalculator.fibonacciRecursive(4))
    }

    @Test
    fun recursiveFib5() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8), fibCalculator.fibonacciRecursive(5))
    }

    @Test
    fun recursiveFib10() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89), fibCalculator.fibonacciRecursive(10))
    }

    @Test
    fun recursiveIterativeFib0() {
        assertEquals(listOf(1), fibCalculator.fibonacciRecursiveIterative(0))
    }

    @Test
    fun recursiveIterativeFib1() {
        assertEquals(listOf(1, 1), fibCalculator.fibonacciRecursiveIterative(1))
    }

    @Test
    fun recursiveIterativeFib2() {
        assertEquals(listOf(1, 1, 2), fibCalculator.fibonacciRecursiveIterative(2))
    }

    @Test
    fun recursiveIterativeFib3() {
        assertEquals(listOf(1, 1, 2, 3), fibCalculator.fibonacciRecursiveIterative(3))
    }

    @Test
    fun recursiveIterativeFib4() {
        assertEquals(listOf(1, 1, 2, 3, 5), fibCalculator.fibonacciRecursiveIterative(4))
    }

    @Test
    fun recursiveIterativeFib5() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8), fibCalculator.fibonacciRecursiveIterative(5))
    }

    @Test
    fun recursiveIterativeFib10() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89), fibCalculator.fibonacciRecursiveIterative(10))
    }
}