import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin büyüklüğünü giriniz: ");
        input = scanner.nextInt();

        for(int i = 1; i<=input; i++){
            for (int j = i; j<=input; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}