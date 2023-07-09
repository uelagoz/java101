import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2;


        System.out.println("Lütfen ilk sayıyı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        number2 = scanner.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz. \n 1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> System.out.println("Toplamın sonucu: " + (number1 + number2));
            case 2 -> System.out.println("Toplamın sonucu: " + (number1 - number2));
            case 3 -> System.out.println("Toplamın sonucu: " + (number1 * number2));
            case 4 -> {
                if (number2 != 0) {
                    System.out.println("Toplamın sonucu: " + (number1 / number2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
            }
            default -> System.out.println("Hatalı giriş yaptınız.");
        }
    }
}