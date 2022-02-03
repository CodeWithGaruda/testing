package stream;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        // integers
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(5, 6);
        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
        finalList.stream().flatMap(x -> x.stream().map(c -> c * 10)).forEach(Map::print);
        System.out.println();
        finalList.stream().flatMap(c -> c.stream()).map(c -> c * 10).forEach(Map::print);
        System.out.println();
        // strings
        List<String> names1 = Arrays.asList("sanath", "subhash", "srikanth", "aparna");
        List<String> names2 = Arrays.asList("omkar", "dindu", "sravanthi", "yakoob");
        List<String> names3 = Arrays.asList("mahesh", "amala", "KP", "GP");
        List<List<String>> names = Arrays.asList(names1, names2, names3);
        names.stream().flatMap(nameList -> nameList.stream()).map(name -> name.toUpperCase()).forEach(Map::print);
        System.out.println();
        names.stream().flatMap(nameList -> nameList.stream().map(name -> name.toUpperCase())).forEach(Map::print);
        // object
        List<Product> productsList1 = Arrays.asList(new Product(1, "sony", 30000),
                new Product(2, "samsung", 20000),
                new Product(3, "LG", 40000),
                new Product(4, "VIVO", 10000),
                new Product(5, "realme", 25000));
        List<Product> productsList2 = Arrays.asList(new Product(6, "sonyPro", 330000),
                new Product(7, "samsungPro", 220000),
                new Product(8, "LG-Pro", 440000),
                new Product(9, "VIVO-pro", 110000),
                new Product(10, "realmePro", 225000));
        List<List<Product>> productList = Arrays.asList(productsList1, productsList2);
        System.out.println();
        productList.stream().flatMap(list -> list.stream()).map(p -> p.getName()).forEach(Map::print);
        System.out.println();
        productList.stream().flatMap(list -> list.stream().map(p -> p.getName())).forEach(Map::print);
    }
}
