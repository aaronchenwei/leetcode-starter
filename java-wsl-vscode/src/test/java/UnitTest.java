import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UnitTest {
    private final Solution solution = new Solution();

    private static Stream<Arguments> provideDataForTestSolution() {
        return Stream.of(
            Arguments.of(new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 }),
            Arguments.of(new int[] { 3, 2, 4 }, 6, new int[] { 1, 2 }));
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestSolution")
    void testSolution(int[] nums, int target, int[] expected) {
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }
}
