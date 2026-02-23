import java.util.Scanner;

public class Stats {

    // Compute the mean of an array of double values
    public static double mean(double[] x) {
        double total = 0.0;
        for (double num : x) {
            total += num;
        }
        return total / x.length;
    }

    // Compute the standard deviation of double values
    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sum = 0.0;
        for (double num : x) {
            sum += Math.pow(num - meanValue, 2);
        }
        return Math.sqrt(sum / (x.length - 1)); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate mean and standard deviation
        double meanValue = mean(numbers);
        double stdDevValue = deviation(numbers);

        System.out.printf("The mean is %.2f%n", meanValue);
        System.out.printf("The standard deviation is %.5f%n", stdDevValue);

        scanner.close();
    }
}
