package lamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PrimeLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
        doWork(i -> {
            int num = i, count = 0;
            for (int j = 1; j <= num; j++)
                if (num % j == 0)
                    count++;
            if (count == 2)
                return true;
            else
                return false;
        }, i -> System.out.println(i), list);
    }

    static void doWork(Predicate<Integer> predicate, Consumer<Integer> consumer, List<Integer> list) {
        for (Integer integer : list) {
            if (predicate.test(integer))
                consumer.accept(integer);
        }
    }
}
