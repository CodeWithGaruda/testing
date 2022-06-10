package concepts;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesOfGiven {
    public static void main(String[] args) {
        String para = "para";
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : para.toCharArray()) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        System.out.println(map);
        work();
    }

    static void work() {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] array = { 1, 2, 2, 12, 12, 44, 44, 55, 55, 1, 1, 2, 2, 3, 4, 5, 3, 2, 2, 3, 23, 34 };
        for (Integer integer : array) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }
        System.out.println(map);
    }
}
