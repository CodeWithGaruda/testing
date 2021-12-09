package lamdaExpressions;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Alpha {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("sanath", "rayala", 24),
                new Person("subhash", "rayala", 20),
                new Person("aparna", "rayala", 46),
                new Person("srikanth", "rayala", 51),
                new Person("omkar", "yeginati", 31),
                new Person("yakub Rao", "yeginati", 35),
                new Person("sravanthi", "yeginati", 31),
                new Person("abhinav", "yeginati", 90));
        work(people, p -> p.getName().startsWith("s"), p -> System.out.println(p));
    }

    static void work(List<Person> persons, Predicate<Person> predicate,
            Consumer<Person> consumer) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }

}
