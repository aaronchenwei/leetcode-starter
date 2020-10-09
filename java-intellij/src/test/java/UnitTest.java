import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UnitTest {
    @ParameterizedTest
    @CsvSource({"011101,5", "00111,5", "1111,3"})
    public void test(String s, int expected) {
//        int actual = new Solution().busyStudent(s);
//        assertEquals(expected, actual);
    }
}
