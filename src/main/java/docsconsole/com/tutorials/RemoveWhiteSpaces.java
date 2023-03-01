package docsconsole.com.tutorials;


public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String string = "test string values";
        System.out.println(RemoveWhiteSpaces.removeWhiteCharsWithJava(string));
    }
    public static String removeWhiteCharsWithJava(String string) {
        StringBuilder output = new StringBuilder();
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        return output.toString();

    }
}
