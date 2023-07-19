import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String result = isPalindrome(userInput);
        System.out.println(result);
    }

    static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return "Palindrom değil.";
            i++;
            j--;
        }
        return "Palindrom";
    }


}