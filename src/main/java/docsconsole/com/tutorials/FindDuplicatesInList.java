package docsconsole.com.tutorials;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        System.out.println("Using filter() with frequency() of Collections");
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,6);
        Set<Integer> set1 = list.stream().filter(i ->
                Collections.frequency(list,i) > 1).collect(Collectors.toSet());
        set1.forEach(System.out::println);

        System.out.println("Using filter() with add() of Set");
        Set set2 = new HashSet();
        Set<Integer> duplicates = list
                .stream()
                .filter(company -> !set2.add(company))
                .collect(Collectors.toSet());
        duplicates.forEach(System.out::println);
    }
}
