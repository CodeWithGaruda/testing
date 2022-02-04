package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindMethods {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("subhash", "cat", "dog", "cat", "srikanth", "aparna",
                "subhash");
        // findAny()
        Optional<String> str = names.stream().findAny();
        System.out.println(str);
        System.out.println(str.get());
        // findFirst()
        str = names.stream().findFirst();
        System.out.println(str);
        System.out.println(str.get());
        names = Arrays.asList();
        str = names.stream().findFirst();
        System.out.println(str);

    }
}
