fun getFactors(num: Int) : List<Int> {
    return (1..num).filter { num % it == 0 }
}

fun getFactorsFromList(nums: List<Int>) : List<Int> {
    return nums.map { getFactors(it) }.flatten().distinct()
}

fun main(args : Array<String>) {
    println(getFactorsFromList(listOf(2, 5, 7, 8, 12, 18, 15)))
    println(getFactorsFromList(listOf(1, 3, 5, 7, 4, 8)))
}