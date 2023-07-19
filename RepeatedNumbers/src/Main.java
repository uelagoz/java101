import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int currentNumber = 0;
        HashSet<Integer> result = new HashSet<>();
        int[] numbers = {5,5,8,4,6,9,66,2,2,7,7,68,68};
        System.out.println("Dizi: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sıralanmış Hali: " + Arrays.toString(numbers));

        for (int number : numbers) {
            if((currentNumber != number) && (number %2 == 0)){
                currentNumber = number;
            } else if(currentNumber == number){
                result.add(number);

            }
        }

        System.out.println("Tekrar eden çift sayılar: " + result);
    }
}