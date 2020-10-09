import org.junit.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test() {
        val a = intArrayOf(0, 1)
        val b = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)

        assertTrue(a.contentEquals(b))
    }
}
