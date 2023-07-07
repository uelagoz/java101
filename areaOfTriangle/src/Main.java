import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, c, u, area;

        System.out.println("Üçgenin 1.kenar uzunluğunu giriniz: ");
        a = scanner.nextInt();
        System.out.println("Üçgenin 2.kenar uzunluğunu giriniz: ");
        b = scanner.nextInt();
        System.out.println("Üçgenin 3.kenar uzunluğunu giriniz: ");
        c = scanner.nextInt();


        u = (a + b + c) / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + area);
    }
}