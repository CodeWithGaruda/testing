package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sanath", "subhash", "srikanth",
                "aparna");
        names.stream().map(s -> s.toUpperCase()).forEach(Map::print);
        System.out.println();
        names.stream().map(i -> i.length()).forEach(Map::print);
        System.out.println();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                13, 14, 15, 16);
        numbers.stream().map(n -> n * n).forEach(Map::print);
        System.out.println();
        List<Product> products = Arrays.asList(new Product(1, "sony", 30000),
                new Product(2, "samsung", 20000),
                new Product(3, "LG", 40000),
                new Product(4, "VIVO", 10000),
                new Product(5, "realme", 25000));
        System.out.println(products.stream().map(m -> m.price).collect(Collectors.toList()));

        List<Product> res = products.stream().filter(p -> p.price <= 25000)
                .map(m -> new Product(m.getId(), m.getName(), m.getPrice() + 5000)).collect(Collectors.toList());
        for (Product product : res) {
            System.out.println(product);
        }
    }

    public static void print(String s) {
        System.out.print(s + " ");
    }

    public static void print(Integer s) {
        System.out.print(s + " ");
    }
}
