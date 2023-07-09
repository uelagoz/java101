import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.0;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, totalCost;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kilo Armut aldığınızı giriniz: ");
        pearKg = scanner.nextDouble();

        System.out.println("Kaç kilo Elma aldığınızı giriniz: ");
        appleKg = scanner.nextDouble();

        System.out.println("Kaç kilo Domates aldığınızı giriniz: ");
        tomatoKg = scanner.nextDouble();

        System.out.println("Kaç kilo Muz aldığınızı giriniz: ");
        bananaKg = scanner.nextDouble();

        System.out.println("Kaç kilo Patlıcan aldığınızı giriniz: ");
        eggplantKg = scanner.nextDouble();

        totalCost = (pearKg * pearPrice) + (appleKg * applePrice) + (tomatoKg * tomatoPrice) + (bananaKg * bananaPrice) + (eggplantKg * eggplantPrice);
        System.out.println(totalCost);

    }
}