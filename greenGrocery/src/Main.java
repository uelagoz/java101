import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.0;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, totalCost;

        System.out.println("Kaç kilo Armut aldığınızı giriniz: ");
        Scanner pearScanner = new Scanner(System.in);
        pearKg = pearScanner.nextDouble();

        System.out.println("Kaç kilo Armut aldığınızı giriniz: ");
        Scanner appleScanner = new Scanner(System.in);
        appleKg = appleScanner.nextDouble();

        System.out.println("Kaç kilo Armut aldığınızı giriniz: ");
        Scanner tomatoScanner = new Scanner(System.in);
        tomatoKg = tomatoScanner.nextDouble();

        System.out.println("Kaç kilo Armut aldığınızı giriniz: ");
        Scanner bananaScanner = new Scanner(System.in);
        bananaKg = bananaScanner.nextDouble();

        System.out.println("Kaç kilo Armut aldığınızı giriniz: ");
        Scanner eggplantScanner = new Scanner(System.in);
        eggplantKg = eggplantScanner.nextDouble();

        totalCost = (pearKg * pearPrice) + (appleKg * applePrice) + (tomatoKg * tomatoPrice) + (bananaKg * bananaPrice) + (eggplantKg * eggplantPrice);
        System.out.println(totalCost);

    }
}