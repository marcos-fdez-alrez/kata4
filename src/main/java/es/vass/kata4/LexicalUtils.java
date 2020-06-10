package es.vass.kata4;

import java.util.stream.IntStream;

public class LexicalUtils {

    public static Boolean checkPalindrome(String input) {
        return IntStream.rangeClosed(0,input.length()/2)
                .noneMatch(index -> input.charAt(index) != input.charAt(input.length()-index-1));
    }

}
