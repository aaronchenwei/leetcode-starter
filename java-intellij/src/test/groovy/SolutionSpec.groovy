import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    @Unroll
    def "unit test"(String s, def expected) {
        when:
        def actual = new Solution().makeGood(s)

        then:
        expected == actual

        where:
        s            | expected
        "leEeetcode" | "leetcode"
        "abBAcC"     | ""
        "s"          | "s"
        "Ee"         | ""

    }

}
