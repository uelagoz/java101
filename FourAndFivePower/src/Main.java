import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        System.out.println("4'ün kuvvetleri: ");
        for(int i = 1;i<=input; i*=4){
            System.out.print(i + " ");
        }

        System.out.println("\n" + "5'in kuvvetleri: ");
        for(int i = 1;i<=input; i*=5){
            System.out.print(i + " ");
        }

    }
}