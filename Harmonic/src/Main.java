public class Main {
    public static void main(String[] args) {

        float[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Harmonik Ortalama: " + numbers.length / harmonicMean(numbers));

    }

    public static float harmonicMean(float[] numbers) {
        float sum = 0;

        for (float number : numbers) {
            sum += 1 / number;
        }

        return sum;
    }
}