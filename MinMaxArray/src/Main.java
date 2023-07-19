import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput, closestSmallerNumber = Integer.MIN_VALUE, closestLargerNumber = Integer.MAX_VALUE;

        int[] list = {12, 45, 78, 32, 9, 65, 21, 37, 56, 80};
        System.out.println("list: " + Arrays.toString(list));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        userInput = scanner.nextInt();

        for (int element : list) {
            if (element < userInput && element > closestSmallerNumber) {
                closestSmallerNumber = element;
            }
            if (element > userInput && element < closestLargerNumber) {
                closestLargerNumber = element;
            }
        }

        if (closestSmallerNumber == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan daha küçük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan daha küçük en yakın sayı: " + closestSmallerNumber);
        }

        if (closestLargerNumber == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan daha büyük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan daha büyük en yakın sayı: " + closestLargerNumber);
        }
    }
}