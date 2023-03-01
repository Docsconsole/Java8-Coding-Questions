package docsconsole.com.tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,10,12,13,16);
        list.stream().filter( i -> i % 2 == 0).forEach(System.out::println);
    }
}
