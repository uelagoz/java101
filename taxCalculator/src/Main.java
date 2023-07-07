import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lütfen KDV'siz fiyatı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if ( input <1000){
            double taxAmount = input * 0.18;
            double total = input + (input * 0.18);
            System.out.println("KDV tutarı: " + taxAmount);
            System.out.println("KDV'li fiyat: " + total);
        }else {
            double taxAmount = input * 0.08;
            double total = input + (input * 0.08);
            System.out.println("KDV tutarı: " + taxAmount);
            System.out.println("KDV'li fiyat: " + total);
        }
    }
}