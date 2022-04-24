package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<String> namesWithNulls = Arrays.asList("sanath", "subhash", "cat", null, "dog", "cat", "srikanth", null,
                "aparna",
                "sanath", "subhash");
        // applying distince on list
        List<String> distinctnames = namesWithNulls.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctnames);
        // u can convert the objects toArray()
        Object[] arr = distinctnames.stream().toArray();
        for (Object object : arr) {
            System.out.println(object);
        }
        // removing null using filter
        distinctnames.stream().filter(s -> s != null).forEach(Map::print);
        // count() will count all the values which is a terminal function
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        // count will return a long value
        System.out.println(count);
        // limit is the non terminal method, it will limit the stream to take particular
        numbers.stream().limit(10).forEach(Map::print);

        // min()
        Optional<Integer> min = numbers.stream().min((v1, v2) -> {
            return v1.compareTo(v2);
        });
        // we cant directly min we need to use get()
        System.out.println(min.get());

        // min()
        Optional<Integer> max = numbers.stream().max((v1, v2) -> {
            return v1.compareTo(v2);
        });
        // we cant directly max we need to use get()
        System.out.println(max.get());

        // reduce=>terminal method
        Optional<Integer> res = numbers.stream().reduce((identity, accumulator) -> {
            return identity + accumulator;
        });
        System.out.println(res.get());

        Optional<String> string = namesWithNulls.stream().reduce((value, accumulator) -> {
            return value + " " + accumulator;
        });
        System.out.println(string.get());

    }

}
