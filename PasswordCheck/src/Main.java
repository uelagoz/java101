import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, password, newPassword;
        int choice;
        Scanner scanner = new Scanner(System.in);

        Hashtable<String,String> users = new Hashtable<>();
        users.put("Batu Yurt","password");
        users.put("Uğurcan Elagöz","password2");

        while(true){
            System.out.println("Kullanıcı adını giriniz: ");
            name = scanner.nextLine();

            if(users.get(name) == null){
                System.out.println("Böyle bir kullanıcı bulunmamaktadır.");
                continue;
            }

            System.out.println("Lütfen şifrenizi giriniz: ");
            password = scanner.nextLine();

            if(password.equals(users.get(name))){
                System.out.println("Giriş başarılı.");
            } else {
                System.out.println("Hatalı giriş yaptınız. \n Şifrenizi sıfırlamak için 1 yazınız. \n Tekrar denemek için 2 yazınız. ");
                choice = scanner.nextInt();
                scanner.nextLine();
                if(choice == 1){
                    System.out.println("Yeni şifrenizi giriniz: ");
                    newPassword = scanner.nextLine();
                    users.put(name,newPassword);
                }

            }
        }


    }
}