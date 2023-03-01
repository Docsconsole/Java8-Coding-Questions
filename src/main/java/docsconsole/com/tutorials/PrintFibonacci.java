package docsconsole.com.tutorials;

import java.util.stream.Stream;

public class PrintFibonacci {

    public static void main(String[] args) {

        /*PrintFibonacci.printFibonacciWithJava(5);
        for( int i = 0; i < 10; i++ ) {
            System.out.println(printFibonacciWithRecursiveJava(i));
        }*/
        PrintFibonacci.printFibonacciWithJava8(5);
    }
    public static void printFibonacciWithJava(int n) {

        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < 10; i++ ) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static int printFibonacciWithRecursiveJava(int n) {
        if ( n <= 1) return n;
        return printFibonacciWithRecursiveJava(n - 1) + printFibonacciWithRecursiveJava( n - 2);
    }

    public static void printFibonacciWithJava8(int n) {
        Stream.iterate(new long[] { 0, 1 }, p -> new long[] { p[1], p[0] + p[1] })
                .limit(n)
                .forEach(p -> System.out.println(p[0]));
    }
}
