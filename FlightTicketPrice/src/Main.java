import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int distance, age, tripType;
        double kmPrice = 0.10, totalPrice;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgilerin alınması
        System.out.print("Mesafe (KM) giriniz: ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1: Tek Yön, 2: Gidiş Dönüş): ");
        tripType = scanner.nextInt();

        // Hatalı veri girişi kontrolü
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Ücret hesaplama
        totalPrice = distance * kmPrice;

        // İndirimlerin uygulanması
        if (age < 12) {
            totalPrice -= totalPrice * 0.5; // %50 indirim
        } else if (age <= 24) {
            totalPrice -= totalPrice * 0.1; // %10 indirim
        } else if (age > 65) {
            totalPrice -= totalPrice * 0.3; // %30 indirim
        }

        if (tripType == 2) {
            totalPrice -= totalPrice * 0.2; // %20 indirim
            totalPrice += totalPrice;
        }

        // Sonuçların ekrana yazdırılması
        System.out.println("Toplam Tutar: " + totalPrice + " TL");
    }
}