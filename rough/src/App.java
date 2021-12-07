import java.util.*;

enum Companies {
    SAMSUNG, APPLE, REALME, REDMI, OPPO, VIVO;
}

public class App {
    public static void main(String[] args) {
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
