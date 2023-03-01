package docsconsole.com.tutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringVowelChecker {
    public static void main(String[] args) {
        String string = "test";
        //System.out.println(Pattern.matches(".*[aeiou].*",string));
        Pattern pattern = Pattern.compile(".*[aeiou].*");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());

    }
}
