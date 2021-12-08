package lamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Rough {
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
        showYeginati(p -> p.getLastName().equals("yeginati"), p -> System.out.println(p), people);
        System.out.println("_______________________________");
        showYeginati(p -> p.getName().startsWith("s"), p -> System.out.println(p), people);
        System.out.println("--------------------------------");
        showYeginati(p -> p.getAge() > 30, p -> System.out.println(p), people);
        System.out.println("---------------------------------");
        showYeginati(p -> p.getAge() < 30, p -> System.out.println(p), people);
    }

    static void showYeginati(Predicate<Person> predicate, Consumer<Person> consumer, List<Person> persons) {
        for (Person person : persons) {
            if (predicate.test(person))
                consumer.accept(person);
        }
    }
}
