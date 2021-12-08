package lamdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PersonsMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("sanath", "rayala", 24),
                new Person("subhash", "rayala", 20),
                new Person("aparna", "rayala", 46),
                new Person("srikanth", "rayala", 51));
        // sorting by firstname
        Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        // create a method that prints all elements in list
        printAll(people);
        // print all names whose first name start with a
        printAllFirstNameStartsWith(people, "su");
        printAllFirstNameStartsWith(people, (p) -> p.getName().startsWith("sa"), p -> System.out.println(p));
    }

    static void printAllFirstNameStartsWith(List<Person> people, String str) {
        for (Person person : people) {
            if (person.getName().startsWith(str))
                System.out.println(person.getName());
        }
    }

    // static void printAllFirstNameStartsWith(List<Person> people, Condition c) {
    // for (Person person : people) {
    // if (c.test(person))
    // System.out.println(person.getName());
    // }
    // }

    static void printAllFirstNameStartsWith(List<Person> people, Predicate<Person> predicate,
            Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person))
                // System.out.println(person.getName());
                consumer.accept(person);
        }
    }

    static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

}

interface Condition {
    boolean test(Person p);
}
