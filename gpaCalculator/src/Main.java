import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mathematic, physic, chemistry, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mathematic = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        physic = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        chemistry = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkish = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        history = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        music = input.nextInt();

        int toplam = (mathematic + physic + chemistry + turkish + history + music);
        double ortalama = (toplam / 6.0);
        System.out.println("Not ortalamanız: " + ortalama);

        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}