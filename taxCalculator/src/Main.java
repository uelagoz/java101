import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lütfen KDV'siz fiyatı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double taxAmount, total;

        if ( input <1000){
            taxAmount = input * 0.18;
            total = input + (input * 0.18);
            System.out.println("KDV tutarı: " + taxAmount);
            System.out.println("KDV'li fiyat: " + total);
        }else {
            taxAmount = input * 0.08;
            total = input + (input * 0.08);
            System.out.println("KDV tutarı: " + taxAmount);
            System.out.println("KDV'li fiyat: " + total);
        }
    }
}