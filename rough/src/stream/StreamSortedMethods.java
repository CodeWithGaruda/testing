package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 5, 6, 4, 7, 8, -5, 23, 34);
        // sorted()
        List<Integer> ascendingList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingList);
        // u need to give comparator.reverseOrder() for descending
        List<Integer> descList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descList);

        // same goes for strings as well
        List<String> names = Arrays.asList("sanath", "subhash", "cat", "dog", "cat", "srikanth", "aparna",
                "sanath", "subhash");
        List<String> aList = names.stream().sorted().collect(Collectors.toList());
        System.out.println(aList);
        // u need to give comparator.reverseOrder() for descending
        List<String> dList = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(dList);

    }
}
