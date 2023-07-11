import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
                System.out.println(i);
            }
        }

        if (count != 0) {
            double average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}