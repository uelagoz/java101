import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, bodyMass;

        System.out.println("Lütfen kilonuzu giriniz: ");
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu(metre cinsinde) giriniz: ");
        Scanner scanner2 = new Scanner(System.in);
        height = scanner2.nextDouble();

        bodyMass = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz: " + bodyMass);


    }
}