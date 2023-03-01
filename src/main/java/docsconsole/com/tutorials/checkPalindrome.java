package docsconsole.com.tutorials;

import java.util.stream.IntStream;

public class checkPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindromeWithJava("nursrun"));
        System.out.println(checkPalindromeWithJava8("madam"));
    }
    public static boolean checkPalindromeWithJava(String string) {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length / 2; i ++ ) {
            if(charArray[i] != charArray[charArray.length - i - 1]) return false;
        }
        return true;
    }
    public static boolean checkPalindromeWithJava8(String string) {
        char[] charArray = string.toCharArray();
        return  IntStream.range(0,charArray.length/2)
                .noneMatch(i -> charArray[i] != charArray[charArray.length - i - 1]);
    }
}
