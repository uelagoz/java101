import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mathematic, physic, turkish, chemistry, music;
        int totalLesson = 0, totalGrade = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mathematic = input.nextInt();
        if(mathematic>0 && mathematic <= 100){
            totalLesson++;
            totalGrade += mathematic;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        physic = input.nextInt();
        if(physic>0 && physic <= 100){
            totalLesson++;
            totalGrade += physic;
        }

        System.out.println("Türkçe notunuzu giriniz: ");
        turkish = input.nextInt();
        if(turkish>0 && turkish <= 100){
            totalLesson++;
            totalGrade += turkish;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        chemistry = input.nextInt();
        if(chemistry>0 && chemistry <= 100){
            totalLesson++;
            totalGrade += chemistry;
        }

        System.out.println("Müzik notunuzu giriniz: ");
        music = input.nextInt();
        if(music>0 && music <= 100){
            totalLesson++;
            totalGrade += music;
        }

        int average = (totalGrade / totalLesson);
        System.out.println("Not ortalamanız: " + average);

        String status = (average >= 55) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(status);

    }
}