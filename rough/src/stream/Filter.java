package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        // even numbers program using filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        // processing strings using streams
        List<String> names = Arrays.asList("sanath", "subhash", "srikanth", "aparna");
        names.stream().filter(str -> str.length() >= 7 && str.length() <= 8).forEach(System.out::println);

        // removing nulls from string
        List<String> namesWithNulls = Arrays.asList("sanath", "subhash", null, "srikanth", null, "aparna");
        namesWithNulls.stream().filter(s -> s != null).forEach(System.out::println);

        // filtering list of products
        List<Product> products = Arrays.asList(new Product(1, "sony", 30000),
                new Product(2, "samsung", 20000),
                new Product(3, "LG", 40000),
                new Product(4, "VIVO", 10000),
                new Product(5, "realme", 25000));
        products.stream().filter((t) -> t.price > 25000).forEach(System.out::println);
    }

}
