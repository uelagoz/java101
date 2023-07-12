import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first = 0, second = 1, sum, input;

        System.out.print("Eleman sayısını giriniz: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        System.out.print("Fibonacci: " + first + " " + second);

        for(int i = 2; i<input; i++){
            sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
        }
    }
}