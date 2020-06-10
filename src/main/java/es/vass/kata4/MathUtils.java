package es.vass.kata4;

import java.util.Collections;
import java.util.function.BiPredicate;
import java.util.stream.LongStream;

public class MathUtils {

    private static final BiPredicate<Long, Long> predicate = ( x , y ) -> LexicalUtils.checkPalindrome( String.valueOf(x * y) );

    public static Long findHighestPalindromeByLimit(Long limit) {

        final Long[] max = {0L};

        LongStream.range(1, limit)
                .boxed()
                .sorted(Collections.reverseOrder())
                .forEach(
                        element -> LongStream.range(1, limit)
                                .boxed()
                                .sorted(Collections.reverseOrder())
                                .forEach(el -> {
                                    if(predicate.test(element, el) && (max[0] < element * el) )
                                        max[0] = element * el;
                        }
                ));

        return max[0];

    }

    public static Double findSquareOfSumFirstNElements(Long limit) {
        Long value = LongStream.rangeClosed(1, limit)
                .boxed()
                .mapToLong(Long::longValue)
                .sum();

        return Math.pow(value,2);
    }

    public static Double findSumOfFirstNElements(Long limit) {
        Double value = LongStream.rangeClosed(1, limit)
                .boxed()
                .mapToDouble(number -> Math.pow(number,2))
                .sum();

        return value;
    }

}
