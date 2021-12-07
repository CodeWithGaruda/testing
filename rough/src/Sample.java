import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        Companies c = Companies.SAMSUNG;
        if (Companies.APPLE == c)
            System.out.println(c);
        else
            System.out.println(Companies.SAMSUNG);

        Companies[] companies = Companies.values();
        // for (Companies companies2 : companies) {
        // System.out.println(companies2);
        // }
        System.out.println(Arrays.toString(companies));
    }
}
