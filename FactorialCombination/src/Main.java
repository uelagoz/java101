import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, factorialNumber1 = 1, number2, factorialNumber2 = 1, difference, differenceFactorial = 1, combination;
        boolean isBigger = false;
        System.out.print("N'in R'li kombinasyonu için N sayısını giriniz: ");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();

        while (!isBigger) {
            System.out.print("R sayısını giriniz: ");
            number2 = scanner.nextInt();

            if (number2 > number1) {
                continue;
            } else {
                isBigger = true;
            }

            difference = number1 - number2;

            for (int i = 1; i <= number1; i++) {
                factorialNumber1 *= i;
            }
            System.out.println("N sayısının faktöriyeli: " + factorialNumber1);

            for (int i = 1; i <= number2; i++) {
                factorialNumber2 *= i;
            }
            System.out.println("R sayısının faktöriyeli: " + factorialNumber2);

            for (int i = 1; i <= difference; i++) {
                differenceFactorial *= i;
            }
            System.out.println("N-R! : " + differenceFactorial);

            combination = factorialNumber1 / (factorialNumber2 * differenceFactorial);
            System.out.println("N'in R'li kombinasyonu:" + combination);

        }


    }
}