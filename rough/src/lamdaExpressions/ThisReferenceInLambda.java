package lamdaExpressions;

import java.util.function.Consumer;

public class ThisReferenceInLambda {
    int i = 100;

    @Override
    public String toString() {
        return "ThisReferenceInLambda []";
    }

    public static void main(String[] args) {
        // this is anonymus class
        // process(3232, new Sample() {
        // int i = 10000;
        // public void print(int i) {
        // System.out.println(i);
        // System.out.println(this.i);
        // }
        // });
        ThisReferenceInLambda a = new ThisReferenceInLambda();
        a.alpha();
    }

    void alpha() {
        process(34, (i) -> {
            System.out.println(i);
            System.out.println(this.i);
        });
    }

    static void process(int i, Consumer<Integer> consumer) {
        consumer.accept(i);
    }
}