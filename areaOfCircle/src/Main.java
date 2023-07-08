import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int angle, r;
        double area, pi = 3.14;

        System.out.println("Lütfen dairenin yarıçapını giriniz: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();

        System.out.println("Lütfen dilimin merkez açısını giriniz: ");
        Scanner scanner2 = new Scanner(System.in);
        angle = scanner2.nextInt();

        area = (pi * (r * r) * angle) / 360;
        System.out.println("Daire diliminin alanı: " + area);
    }
}