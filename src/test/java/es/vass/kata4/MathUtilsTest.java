package es.vass.kata4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    private static final Long LIMIT = 999L;
    private static final Long HIGHEST_PALINDROME_RESULT_THREE_DIGITS = 906_609L;

    private static final Long LIMIT_SUM = 100L;
    private static final Long SUM_SQUARE_DIFFERENCE_RESULT = 25_164_150L;

    @DisplayName("Test MathUtils.findHighestPalindromeByLimit using 3 digits")
    @Test
    void testMultiplesUnderTen() {
        Long result = MathUtils.findHighestPalindromeByLimit(LIMIT);
        assertEquals(HIGHEST_PALINDROME_RESULT_THREE_DIGITS,result);
    }

    @DisplayName("Test MathUtils.findSumOfFirstNElements using 3 digits")
    @Test
    void testSquareDifference() {
        Double result = MathUtils.findSquareOfSumFirstNElements(LIMIT_SUM)-MathUtils.findSumOfFirstNElements(LIMIT_SUM);
        assertEquals(SUM_SQUARE_DIFFERENCE_RESULT,result.longValue());
    }

}
