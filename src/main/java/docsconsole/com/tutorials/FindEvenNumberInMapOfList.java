package docsconsole.com.tutorials;

import java.util.*;

public class FindEvenNumberInMapOfList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,5,7,9);
        List<Integer> list2 = Arrays.asList(12,13,15,16,17,19);
        List<Integer> list3 = Arrays.asList(22,23,24,27,29);
        Map<Integer, List> map = new HashMap();
        map.put(1, list1);
        map.put(2, list2);
        map.put(3, list3);
        map.values().forEach( l ->
                l.stream().filter(Objects::nonNull)
                        .filter(i -> Integer.parseInt(i.toString()) % 2 == 0)
                .forEach(System.out::println));
    }
}
