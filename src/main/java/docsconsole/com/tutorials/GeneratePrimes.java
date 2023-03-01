package docsconsole.com.tutorials;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratePrimes {
    public static void main(String[] args) {
        IntStream.range(2,20)
                .filter(n -> IntStream.range(2, n/2).noneMatch(i -> n % i == 0))
                .boxed()
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
