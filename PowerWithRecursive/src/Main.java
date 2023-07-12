import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, exponent, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        base = scanner.nextInt();

        System.out.print("Üssü girin: ");
        exponent = scanner.nextInt();

        result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}