import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        input = scanner.nextInt();

        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                total += i;
            }
        }
        if (total == input) {
            System.out.println(input + " bir mükemmel sayıdır.");
        }else{
            System.out.println(input + " bir mükemmel sayı değildir.");
        }
    }
}