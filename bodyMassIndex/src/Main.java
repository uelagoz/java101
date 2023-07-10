import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, bodyMass;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu giriniz: ");
        weight = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu(metre cinsinde) giriniz: ");
        height = scanner.nextDouble();

        bodyMass = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz: " + bodyMass);


    }
}