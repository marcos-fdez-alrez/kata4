import es.vass.kata4.MathUtils;

import java.util.stream.LongStream;

public class Launcher {

    public static void main(String...args) {
        System.out.println("El resultado es: "+ MathUtils.findHighestPalindromeByLimit(999L));
        System.out.println("El resultado es: " + MathUtils.findSumOfFirstNElements(100L)) ;

        System.out.println("El resultado es: " + MathUtils.findSquareOfSumFirstNElements(100L)) ;

        System.out.println("El resultado es: " + (MathUtils.findSquareOfSumFirstNElements(100L)-MathUtils.findSumOfFirstNElements(100L))) ;

        LongStream.rangeClosed(1, 10L)
                .boxed()
                .mapToLong(Long::longValue).forEach(System.out::println);
    }

}
