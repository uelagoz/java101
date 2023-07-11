import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgilerin alınması
        System.out.print("Yıl Giriniz: ");
        year = scanner.nextInt();

        // Sonuçların hesaplanıp aynı zamanda ekrana yazdırılması
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır");
                } else {
                    System.out.println(year + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(year + " bir artık yıldır");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}