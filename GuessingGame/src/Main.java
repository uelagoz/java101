import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int right = 0, selected;
        boolean isWin = false, isWrong = false;
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);

        int[] wrong = new int[5];

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected == number) {
                System.out.println("Gizli sayı: " + number);
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Maalesef yanlış tahmin!");

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Gizli sayı: " + number);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}