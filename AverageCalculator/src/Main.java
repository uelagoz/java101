import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0, count = 0; //Toplamı saklamak ve bölünen sayıların adedini öğrenmek için değişken tanımlanması
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgilerin alınması
        System.out.print("Bir sayı girin: ");
        number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
                System.out.print("3 ve 4'e tam bölünen sayılar: " + i + " ");//Bölünen sayıların ekrana yazdırılması
            }
        }

        // Sonuçların ekrana yazdırılması
        if (count != 0) {
            double average = (double) sum / count; //Ortalamanın hesaplanması
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}