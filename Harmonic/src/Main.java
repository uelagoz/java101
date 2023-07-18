public class Main {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers.length / harmonicMean(numbers));

    }

    public static double harmonicMean(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += 1 / number;
        }

        return sum;
    }
}