import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chineseZodiac;
        int birthYear;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgilerin alınması
        System.out.print("Doğum yılınızı girin: ");
        birthYear = scanner.nextInt();

        // Çin Zodyağı hesaplama
        chineseZodiac = switch (birthYear % 12) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Hatalı giriş yaptınız.";


        };
        // Sonuçların ekrana yazdırılması
        System.out.println("Çin Zodyağı burcunuz: " + chineseZodiac);
    }
}