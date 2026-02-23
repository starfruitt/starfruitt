import java.util.Scanner;

public class ISBN13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first 12 digits of an ISBN-13 as a string
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn12 = input.nextLine();

        // Validate the input length
        if (isbn12.length() != 12 || !isbn12.matches("\\d+")) {
            System.out.println(isbn12 + " is an invalid input");
        } else {
            // Calculate the checksum
            int checksum = calculateChecksum(isbn12);

            // Display the complete ISBN-13
            String isbn13 = isbn12 + checksum;
            System.out.println("The ISBN-13 number is " + isbn13);
        }

        input.close();
    }

    // Method to calculate the checksum of ISBN-13
    public static int calculateChecksum(String isbn12) {
        int sum = 0;

        // Loop through the first 12 digits
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(isbn12.charAt(i));

            // Add to the sum: odd positions (+digit), even positions (+3 * digit)
            sum += (i % 2 == 0) ? digit : 3 * digit;
        }

        // Compute the checksum using the formula
        int checksum = 10 - (sum % 10);

        // If the checksum equals 10, replace it with 0
        return (checksum == 10) ? 0 : checksum;
    }
}