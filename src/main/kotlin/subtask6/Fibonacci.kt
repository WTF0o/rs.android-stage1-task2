package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var previous: Int = 0
        var buf: Int = 0
        var current: Int = 1
        var fibonacciSequence: Int = 0
        val equal:Int

        while (fibonacciSequence < n) {

            buf = current
            current += previous
            previous = buf
            fibonacciSequence = previous * current

        }
        equal = if(fibonacciSequence == n) 1 else 0

        return intArrayOf(previous,current,equal)
    }
}
