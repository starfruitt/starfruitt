import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> occurrences = new HashMap<>();

        System.out.print("Enter the integers between 1 and 100 (0 to end): ");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Exit if the user enters 0
            }

            // Only count numbers in the range 1 to 100
            if (number >= 1 && number <= 100) {
                occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
            }
        }

        // Display the counts for each number
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            System.out.println(num + " occurs " + count + (count > 1 ? " times" : " time"));
        }

        scanner.close();
    }
}
