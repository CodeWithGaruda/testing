package lamdaExpressions;

import java.util.function.BiConsumer;

public class ExceptionInLambdas {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 0;
        process(numbers, key, lambdaExceptionHandler((k, v) -> System.out.println(k / v)));

    }

    static BiConsumer<Integer, Integer> lambdaExceptionHandler(BiConsumer<Integer, Integer> biConsumer) {
        // return biConsumer;
        return (k, v) -> {
            try {
                System.out.println(k / v);
            } catch (Exception e) {
                System.out.println("handled at lambdaExceptionHandler /0 error");
            }
        };

    }

    static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            biConsumer.accept(i, key);
        }
    }
}
