import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(integers));
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer integer : integers) {
            if(frequencyMap.containsKey(integer)){
                frequencyMap.put(integer, frequencyMap.get(integer)+1);
            }else {
                frequencyMap.put(integer, 1);
            }

        }

        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " sayısı " + frequencyMap.get(key) + " kere tekrar edildi.");
        }
    }
}