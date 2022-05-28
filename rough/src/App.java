import java.util.*;

import stream.Product;

enum Companies {
    SAMSUNG, APPLE, REALME, REDMI, OPPO, VIVO;
}

public class App {
    public static void main(String[] args) {
        List<Product> product = Arrays.asList(
                new Product(1, "apple", 20),
                new Product(2, "grape", 21),
                new Product(3, "kiwi", 20),
                new Product(4, "orange", 24));
        Collections.sort(product, Collections.reverseOrder());
        for (Product p : product) {
            System.out.println(p);
        }
        System.out.println("------");
        Collections.sort(product);
        for (Product p : product) {
            System.out.println(p);
        }
    }

    public static void work() {
        System.out.println("menu:");
        System.out.println("1.Apple");
        System.out.println("2.Samsung");
        System.out.println("enter option:");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        Companies c;
        if (option == 1) {
            c = Companies.APPLE;
        } else {
            c = Companies.SAMSUNG;
        }
        switch (c) {
            case APPLE:
                System.out.println("APPLE");
                break;
            case SAMSUNG:
                System.out.println("SAMSUNG");
                break;
            default:
                System.out.println("default");
                break;
        }
        scan.close();
    }
}
