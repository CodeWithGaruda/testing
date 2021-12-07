package lamdaExpressions;

public class Main {
    public static void main(String[] args) {
        StringLenghLambda sll = string -> string.length();
        System.out.println(sll.getLength("asdfadsf"));

        work(string -> string.length());
    }

    static void work(StringLenghLambda s) {
        System.out.println(s.getLength("sample"));
    }
}

@FunctionalInterface
interface StringLenghLambda {
    int getLength(String s);
}