package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(number * number, number - 1)
    }

    private fun decompose(value: Int, start: Int): Array<Int>? {
        for( i in start downTo 1 ) {
            val square = i * i
            val diff = value - square
            if(diff == 0) {
                return arrayOf(i)
            }

            if(diff < 0) {
                return null
            }

            var sqrt = sqrt(diff.toDouble()).toInt()
            if(sqrt >= i) {
                sqrt = i - 1
            }

            val res = decompose(diff, sqrt)
            if( res != null) {
                return res + arrayOf(i)
            }
        }
        return null
    }


}
