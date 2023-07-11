import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day,month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ayı giriniz (sayı olarak): ");

        month = scanner.nextInt();
        System.out.print("Günü giriniz: ");
        day = scanner.nextInt();
        scanner.close();

        String zodiacSign = "";
        boolean isError = false;


        if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            zodiacSign = "Kova Burcu";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            zodiacSign = "Balık Burcu";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            zodiacSign = "Koç Burcu";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            zodiacSign = "Boğa Burcu";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            zodiacSign = "İkizler Burcu";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            zodiacSign = "Yengeç Burcu";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Aslan Burcu";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Başak Burcu";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Terazi Burcu";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Akrep Burcu";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Yay Burcu";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            zodiacSign = "Oğlak Burcu";
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Geçersiz tarih!");
        } else {
            System.out.println("Burcunuz: " + zodiacSign);
        }
    }
}