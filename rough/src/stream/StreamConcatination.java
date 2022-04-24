package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatination {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> animalList = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birdList = Arrays.asList("peacock", "parrot", "crow");
        Stream<String> s1 = animalList.stream();
        Stream<String> s2 = birdList.stream();
        List<String> fList = Stream.concat(s1, s2).collect(Collectors.toList());
        System.out.println(fList);
        System.out.println(System.currentTimeMillis() - start);
    }
}
