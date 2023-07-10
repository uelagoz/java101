import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int angle, r;
        double area, pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dairenin yarıçapını giriniz: ");
        r = scanner.nextInt();

        System.out.println("Lütfen dilimin merkez açısını giriniz: ");
        angle = scanner.nextInt();

        area = (pi * (r * r) * angle) / 360;
        System.out.println("Daire diliminin alanı: " + area);
    }
}