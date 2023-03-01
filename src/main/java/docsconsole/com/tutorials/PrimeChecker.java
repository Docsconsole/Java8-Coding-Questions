package docsconsole.com.tutorials;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeChecker {
    public static void main(String[] args) {
        //System.out.println(PrimeChecker.checkPrimeWithJava(19));
        //System.out.println(PrimeChecker.checkPrimeWithJava8(13));
        Stream.of(5,7,11,23,25).filter(PrimeChecker::checkPrimeWithJava8).forEach(System.out::println);
    }
    public static boolean checkPrimeWithJava(int n) {
        if(n == 0 && n == 1)
            return false;
        if(n == 2)
            return true;
        for(int i = 2; i <= n/2; i ++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean checkPrimeWithJava8(int n) {
        if(n ==1 || n ==2 ) return false;
        //return !IntStream.rangeClosed(2, n/2).anyMatch(i -> n % i == 0);
        return IntStream.rangeClosed(2, n/2).noneMatch(i -> n % i == 0);
    }
}
