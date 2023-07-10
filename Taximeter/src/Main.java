import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int openingFee = 10, min = 20;
        double km, totalFee, perKm = 2.20;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kaç km gitmek istediğinizi yazınız: ");
        km = scanner.nextInt();

        totalFee = openingFee + (km * perKm);

        if (totalFee < 20){
            System.out.println("Tutar: " + min);
        } else {
            System.out.println("Tutar: " + totalFee);
        }




    }
}