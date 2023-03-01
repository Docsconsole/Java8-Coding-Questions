package docsconsole.com.tutorials;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindHighestNumberInList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,13,15,16,17,19,22,23,24,16,27,29);
        System.out.println(list.stream().max(Integer::compare).get());
        System.out.println(list.stream().max(Integer::compareTo).get());
        System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
        System.out.println(list.stream().mapToInt(Integer::valueOf).max().getAsInt());


        System.out.println(list.stream().reduce(Integer::max).get());
        System.out.println(list.stream().reduce(Math::max).get());
        System.out.println(list.stream().reduce((x,y) -> x > y ? x : y).get());
        System.out.println(list.stream().reduce((x,y) -> Integer.max(x,y)).get());
        System.out.println(list.stream().reduce((x,y) -> Math.max(x,y)).get());

        System.out.println(list.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get());
        System.out.println(list.stream().collect(Collectors.summarizingInt(Integer::valueOf)).getMax());
        System.out.println(list.stream().collect(Collectors.reducing(Integer::max)).get());
        System.out.println(list.stream().collect(Collectors.reducing(Math::max)).get());

    }
}
