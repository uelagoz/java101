import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, number;
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan gerekli bilgilerin alınması
        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();

        //Çift ve 4'ün katı olan sayıların toplamını tutan döngü
        while (!(number %2 == 1)) {
            if (number % 2 == 0) {
                total += number;
            }
            System.out.print("Bir sayı giriniz: ");
            number = scanner.nextInt();
        }

        //Sonucun ekrana yazdırılması
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı " + total);
    }
}