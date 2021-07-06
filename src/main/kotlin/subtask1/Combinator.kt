package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {

        val m = array[0]
        val n = array[1]

        for (x in 0..n) {
            if ( factorial(x) * factorial(n - x) == factorial(n) / m ) {
                return x
            }
        }
        return null

    }

    private fun factorial(n: Int): Long {

        if (n >= 1) {
            return  n * factorial(n - 1)
        } else {
            return 1
        }

    }

}
