package lamdaExpressions;

import java.util.function.BiConsumer;

public class Sample {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int key = 0;
        // work(key, array, (a, b) -> System.out.println(a / b));
        work(key, array, handleException((a, b) -> System.out.println(a / b)));
    }

    static void work(int key, int[] array, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : array) {
            biConsumer.accept(i, key);
        }
    }

    static BiConsumer<Integer, Integer> handleException(BiConsumer<Integer, Integer> biConsumer) {
        return (a, b) -> {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }
}
