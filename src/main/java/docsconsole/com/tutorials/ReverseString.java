package docsconsole.com.tutorials;

import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        //System.out.println(ReverseString.reverseStringWithJava("TestOne"));
        System.out.println(ReverseString.reverseStringWithJava8("TestTwo"));

    }
    public static String reverseStringWithJava(String string) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = string.toCharArray();
        for(int i = charArray.length - 1; i >= 0; i -- ) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
        public static String reverseStringWithJava8(String string) {
         return  IntStream.range(0, string.length())
                .map(i -> string.charAt(string.length() - i - 1))
                .collect(StringBuilder::new,( sb,i) -> sb.append((char) i),StringBuilder::append).toString();
        }
}
