import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        input = scanner.nextInt();
        recursive(input);

    }

    public static void recursive(int input) {
        System.out.println(input);

        if (input <= 0) {
            return;
        }
        recursive(input - 5);
        System.out.println(input);
    }
}