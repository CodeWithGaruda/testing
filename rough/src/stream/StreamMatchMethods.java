package stream;

import java.util.HashSet;
import java.util.Set;

public class StreamMatchMethods {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("bonda");
        fruits.add("pineApple");
        fruits.add("sapota");
        fruits.add("grapes");
        fruits.add("guvva");

        // anyMatch()
        boolean anyMatch = fruits.stream().anyMatch(fruit -> {
            return fruit.startsWith("g");
        });
        System.out.println(anyMatch);

        // allMatch()
        boolean allMatch = fruits.stream().allMatch(fruit -> {
            return fruit.startsWith("g");
        });
        System.out.println(allMatch);

        // noneMatch()
        boolean noneMatch = fruits.stream().noneMatch(fruit -> {
            return fruit.startsWith("g");
        });
        System.out.println(noneMatch);
    }
}
