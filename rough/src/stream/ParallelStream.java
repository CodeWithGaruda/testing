package stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Student> sList = Arrays.asList(new Student("sanath", 99),
                new Student("subhash", 80),
                new Student("Omkar", 85),
                new Student("abhivan", 75),
                new Student("rahul", 59),
                new Student("bharadwaj", 65),
                new Student("KP", 75));
        long start = System.currentTimeMillis();
        sList.stream().filter(student -> student.getScore() > 75).forEach(System.out::println);
        System.out.println("seqential stream:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        sList.parallelStream().filter(student -> student.getScore() > 75).forEach(System.out::println);
        System.out.println("parallel stream:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        sList.stream().parallel().filter(student -> student.getScore() > 75).forEach(System.out::println);
        System.out.println("seqential->parallel stream:" + (System.currentTimeMillis() - start));

    }
}

class Student {
    int score;
    String name;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }

}